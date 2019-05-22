package com.banksystem.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.banksystem.entity.account.Account;
import com.banksystem.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport implements SessionAware,ServletRequestAware {

	private Account account;
	
	private AccountService accountService;
	//返回的登录信息
	private String loginMes;
	//转账金额
	private String transferMoney;
	//转账信息
	private String transMes;
	private Map<String,Object> session;
	
	private HttpServletRequest servletRequest;
	//
	/**
	 * 登录
	 * @return
	 */
	public String login() {
		String loginUser = servletRequest.getRemoteUser();
		System.out.println("-----------------"+loginUser);
		System.out.println("----------------account login");
		System.out.println("account:" + account);
		String hql = "from Account where cardNo=? ";
		System.out.println(hql);
		Object[] param = new Object[5];
		param[0]=account.getCardNo();
		List<Account> accountList = accountService.select(hql, param);
		System.out.println("------------size：");
		//验证卡号是否存在
		if (accountList.size() != 1) {
			loginMes = "登录失败！输入的卡号不存在";
			return "loginFail";
		}
		// 接受返回的Account对象
		Account accountInfo = accountList.get(0);
		System.out.println("--------returnAccount"+accountInfo);
		//验证密码是否正确
		if (!accountInfo.getPassword().equals(account.getPassword())) {
			System.out.println("密码不对");
			loginMes = "登录失败！输入的密码错误";
			return "loginFail";
		}
		//验证是否被冻结
		if (accountInfo.getStatus() == 0) {
			System.out.println("卡被冻结");
			loginMes = "登录失败！卡号已被冻结";
			return "loginFail";
		}
		/*HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();*/
		session.put("accountInfo", accountInfo);
		loginMes="loginSuc";
		return "loginSuccess";
	}

	
	/**
	 * 转账
	 * @return
	 */
	public String check() {
		System.out.println("----------------account check");
		System.out.println("account:" + account+"-"+"transferMoney："+transferMoney);
		String hql = "from Account where cardNo=? ";
		List<Account> accountList = accountService.select(hql, account.getCardNo());
		System.out.println(accountList.size());
		//验证卡号是否存在
		if (accountList.size() != 1) {
			System.out.println("卡号不存在");
			transMes="转账失败！输入的卡号不存在";
			return "transFail";
		}
		// 接受返回的Account对象
		Account accountInfo = accountList.get(0);
		System.out.println("returnAccount"+accountInfo);
		//验证是否被冻结
		if (accountInfo.getStatus() == 0) {
			System.out.println("卡被冻结");
			transMes = "转账失败！卡号已被冻结";
			return "transFail";
		}
		transMes = "transSuc";
		return"transSuccess";
	}
	
	public String transfer() {
		System.out.println("--------------account transfer");
		return "ttransfer";
		}
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getLoginMes() {
		return loginMes;
	}

	public void setLoginMes(String loginMes) {
		this.loginMes = loginMes;
	}

	public String getTransferMoney() {
		return transferMoney;
	}

	public void setTransferMoney(String transferMoney) {
		this.transferMoney = transferMoney;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getTransMes() {
		return transMes;
	}


	public void setTransMes(String transMes) {
		this.transMes = transMes;
	}


	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}


	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
}
