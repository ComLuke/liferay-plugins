/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public class OAuthConsumerClp extends BaseModelImpl<OAuthConsumer>
	implements OAuthConsumer {
	public OAuthConsumerClp() {
	}

	public long getPrimaryKey() {
		return _oAuthConsumerId;
	}

	public void setPrimaryKey(long pk) {
		setOAuthConsumerId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_oAuthConsumerId);
	}

	public long getOAuthConsumerId() {
		return _oAuthConsumerId;
	}

	public void setOAuthConsumerId(long oAuthConsumerId) {
		_oAuthConsumerId = oAuthConsumerId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getGadgetId() {
		return _gadgetId;
	}

	public void setGadgetId(long gadgetId) {
		_gadgetId = gadgetId;
	}

	public String getServiceName() {
		return _serviceName;
	}

	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	public String getConsumerKey() {
		return _consumerKey;
	}

	public void setConsumerKey(String consumerKey) {
		_consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return _consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		_consumerSecret = consumerSecret;
	}

	public String getKeyType() {
		return _keyType;
	}

	public void setKeyType(String keyType) {
		_keyType = keyType;
	}

	public String getKeyName() {
		return _keyName;
	}

	public void setKeyName(String keyName) {
		_keyName = keyName;
	}

	public String getCallbackURL() {
		return _callbackURL;
	}

	public void setCallbackURL(String callbackURL) {
		_callbackURL = callbackURL;
	}

	public OAuthConsumer toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (OAuthConsumer)Proxy.newProxyInstance(OAuthConsumer.class.getClassLoader(),
				new Class[] { OAuthConsumer.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		OAuthConsumerClp clone = new OAuthConsumerClp();

		clone.setOAuthConsumerId(getOAuthConsumerId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setGadgetId(getGadgetId());
		clone.setServiceName(getServiceName());
		clone.setConsumerKey(getConsumerKey());
		clone.setConsumerSecret(getConsumerSecret());
		clone.setKeyType(getKeyType());
		clone.setKeyName(getKeyName());
		clone.setCallbackURL(getCallbackURL());

		return clone;
	}

	public int compareTo(OAuthConsumer oAuthConsumer) {
		int value = 0;

		value = getServiceName().compareTo(oAuthConsumer.getServiceName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		OAuthConsumerClp oAuthConsumer = null;

		try {
			oAuthConsumer = (OAuthConsumerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = oAuthConsumer.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{oAuthConsumerId=");
		sb.append(getOAuthConsumerId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", gadgetId=");
		sb.append(getGadgetId());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", consumerKey=");
		sb.append(getConsumerKey());
		sb.append(", consumerSecret=");
		sb.append(getConsumerSecret());
		sb.append(", keyType=");
		sb.append(getKeyType());
		sb.append(", keyName=");
		sb.append(getKeyName());
		sb.append(", callbackURL=");
		sb.append(getCallbackURL());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.opensocial.model.OAuthConsumer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oAuthConsumerId</column-name><column-value><![CDATA[");
		sb.append(getOAuthConsumerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gadgetId</column-name><column-value><![CDATA[");
		sb.append(getGadgetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>consumerKey</column-name><column-value><![CDATA[");
		sb.append(getConsumerKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>consumerSecret</column-name><column-value><![CDATA[");
		sb.append(getConsumerSecret());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keyType</column-name><column-value><![CDATA[");
		sb.append(getKeyType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keyName</column-name><column-value><![CDATA[");
		sb.append(getKeyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callbackURL</column-name><column-value><![CDATA[");
		sb.append(getCallbackURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _oAuthConsumerId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _gadgetId;
	private String _serviceName;
	private String _consumerKey;
	private String _consumerSecret;
	private String _keyType;
	private String _keyName;
	private String _callbackURL;
}