package com.xander.sendemaillib;

import android.util.Log;

/*
* 创建时间：${date} ${time}
* @author: ouyangmuyuan
*  用途：发送邮件
*/
public class SendEmail {

	/**
	 * @param mailServerHost  邮件服务主机 比如163邮箱的 smtp.163.com
	 * @param mailServerPort  服务器端口号 163的是25
	 * @param userName  邮箱的账户名
	 * @param password  邮箱登录密码
	 * @param fromEamilAddress  邮箱地址，比如163的
	 * @param toAddress  发送到哪里
	 * @param emailTitle  标题
	 * @param emailContent 内容 String类型
	 */
	public static void send(String mailServerHost,
							String mailServerPort,
							String userName,
							String password,
							String fromEamilAddress,
							String toAddress,
							String emailTitle,
							String emailContent ){
        //这个类主要是设置邮件
	  MailSenderInfo mailInfo = new MailSenderInfo(); 
	  mailInfo.setMailServerHost(mailServerHost);
	  mailInfo.setMailServerPort(mailServerPort);
	  mailInfo.setValidate(true); 
	  mailInfo.setUserName(userName);//用户名
	  mailInfo.setPassword(password);//您的邮箱密码
	  mailInfo.setFromAddress(fromEamilAddress);
	  mailInfo.setToAddress(toAddress);
	  mailInfo.setSubject(emailTitle);
	  mailInfo.setContent(emailContent);
        //这个类主要来发送邮件
	  SimpleMailSender sms = new SimpleMailSender();
      sms.sendTextMail(mailInfo);//发送文体格式 
      sms.sendHtmlMail(mailInfo);//发送html格式
	}

	/**
	 * @param toAddress  可以接受一组邮箱
	 * @param emailTitle
	 * @param emailContent
	 */
	public static void send(
							String[] toAddress,
							String emailTitle,
							String emailContent ){
		//这个类主要是设置邮件 git config --global user.email 596928539@qq.com
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setFromAddress("xu596928539@163.com");
		mailInfo.setUserName("xu596928539");//用户名
		mailInfo.setPassword("liux1228");//您的邮箱密码

		for (int i = 0; i < toAddress.length; i++) {
			mailInfo.setToAddress(toAddress[i]);
		}

		mailInfo.setSubject(emailTitle);
		mailInfo.setContent(emailContent);
		//这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);//发送文体格式
		sms.sendHtmlMail(mailInfo);//发送html格式
	}

	public static void sendWith163Default(){
        //这个类主要是设置邮件
	  MailSenderInfo mailInfo = new MailSenderInfo();
	  mailInfo.setMailServerHost("smtp.163.com");
	  mailInfo.setMailServerPort("25");
	  mailInfo.setValidate(true);
	  mailInfo.setUserName("xu596928539");//用户名
	  mailInfo.setPassword("liux1228");//您的邮箱密码
	  mailInfo.setFromAddress("xu596928539@163.com");
	  mailInfo.setToAddress("596928539@qq.com");
	  mailInfo.setSubject("设置邮箱标题");
	  mailInfo.setContent("金泰呢发送邮件测试");
        //这个类主要来发送邮件
	  SimpleMailSender sms = new SimpleMailSender();
      sms.sendTextMail(mailInfo);//发送文体格式
      sms.sendHtmlMail(mailInfo);//发送html格式
	}


}
