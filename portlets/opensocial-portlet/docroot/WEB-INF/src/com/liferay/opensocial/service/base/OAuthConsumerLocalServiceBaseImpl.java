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

package com.liferay.opensocial.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.opensocial.model.OAuthConsumer;
import com.liferay.opensocial.service.GadgetLocalService;
import com.liferay.opensocial.service.OAuthConsumerLocalService;
import com.liferay.opensocial.service.OAuthTokenLocalService;
import com.liferay.opensocial.service.persistence.GadgetPersistence;
import com.liferay.opensocial.service.persistence.OAuthConsumerPersistence;
import com.liferay.opensocial.service.persistence.OAuthTokenPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the o auth consumer local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.opensocial.service.impl.OAuthConsumerLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.opensocial.service.impl.OAuthConsumerLocalServiceImpl
 * @see com.liferay.opensocial.service.OAuthConsumerLocalServiceUtil
 * @generated
 */
public abstract class OAuthConsumerLocalServiceBaseImpl
	implements OAuthConsumerLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.opensocial.service.OAuthConsumerLocalServiceUtil} to access the o auth consumer local service.
	 */

	/**
	 * Adds the o auth consumer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthConsumer the o auth consumer to add
	 * @return the o auth consumer that was added
	 * @throws SystemException if a system exception occurred
	 */
	public OAuthConsumer addOAuthConsumer(OAuthConsumer oAuthConsumer)
		throws SystemException {
		oAuthConsumer.setNew(true);

		return oAuthConsumerPersistence.update(oAuthConsumer, false);
	}

	/**
	 * Creates a new o auth consumer with the primary key. Does not add the o auth consumer to the database.
	 *
	 * @param oAuthConsumerId the primary key for the new o auth consumer
	 * @return the new o auth consumer
	 */
	public OAuthConsumer createOAuthConsumer(long oAuthConsumerId) {
		return oAuthConsumerPersistence.create(oAuthConsumerId);
	}

	/**
	 * Deletes the o auth consumer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthConsumerId the primary key of the o auth consumer to delete
	 * @throws PortalException if a o auth consumer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteOAuthConsumer(long oAuthConsumerId)
		throws PortalException, SystemException {
		oAuthConsumerPersistence.remove(oAuthConsumerId);
	}

	/**
	 * Deletes the o auth consumer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthConsumer the o auth consumer to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteOAuthConsumer(OAuthConsumer oAuthConsumer)
		throws SystemException {
		oAuthConsumerPersistence.remove(oAuthConsumer);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return oAuthConsumerPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return oAuthConsumerPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return oAuthConsumerPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return oAuthConsumerPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the o auth consumer with the primary key.
	 *
	 * @param oAuthConsumerId the primary key of the o auth consumer to get
	 * @return the o auth consumer
	 * @throws PortalException if a o auth consumer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public OAuthConsumer getOAuthConsumer(long oAuthConsumerId)
		throws PortalException, SystemException {
		return oAuthConsumerPersistence.findByPrimaryKey(oAuthConsumerId);
	}

	/**
	 * Gets a range of all the o auth consumers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth consumers to return
	 * @param end the upper bound of the range of o auth consumers to return (not inclusive)
	 * @return the range of o auth consumers
	 * @throws SystemException if a system exception occurred
	 */
	public List<OAuthConsumer> getOAuthConsumers(int start, int end)
		throws SystemException {
		return oAuthConsumerPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of o auth consumers.
	 *
	 * @return the number of o auth consumers
	 * @throws SystemException if a system exception occurred
	 */
	public int getOAuthConsumersCount() throws SystemException {
		return oAuthConsumerPersistence.countAll();
	}

	/**
	 * Updates the o auth consumer in the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthConsumer the o auth consumer to update
	 * @return the o auth consumer that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public OAuthConsumer updateOAuthConsumer(OAuthConsumer oAuthConsumer)
		throws SystemException {
		oAuthConsumer.setNew(false);

		return oAuthConsumerPersistence.update(oAuthConsumer, true);
	}

	/**
	 * Updates the o auth consumer in the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthConsumer the o auth consumer to update
	 * @param merge whether to merge the o auth consumer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the o auth consumer that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public OAuthConsumer updateOAuthConsumer(OAuthConsumer oAuthConsumer,
		boolean merge) throws SystemException {
		oAuthConsumer.setNew(false);

		return oAuthConsumerPersistence.update(oAuthConsumer, merge);
	}

	/**
	 * Gets the gadget local service.
	 *
	 * @return the gadget local service
	 */
	public GadgetLocalService getGadgetLocalService() {
		return gadgetLocalService;
	}

	/**
	 * Sets the gadget local service.
	 *
	 * @param gadgetLocalService the gadget local service
	 */
	public void setGadgetLocalService(GadgetLocalService gadgetLocalService) {
		this.gadgetLocalService = gadgetLocalService;
	}

	/**
	 * Gets the gadget persistence.
	 *
	 * @return the gadget persistence
	 */
	public GadgetPersistence getGadgetPersistence() {
		return gadgetPersistence;
	}

	/**
	 * Sets the gadget persistence.
	 *
	 * @param gadgetPersistence the gadget persistence
	 */
	public void setGadgetPersistence(GadgetPersistence gadgetPersistence) {
		this.gadgetPersistence = gadgetPersistence;
	}

	/**
	 * Gets the o auth consumer local service.
	 *
	 * @return the o auth consumer local service
	 */
	public OAuthConsumerLocalService getOAuthConsumerLocalService() {
		return oAuthConsumerLocalService;
	}

	/**
	 * Sets the o auth consumer local service.
	 *
	 * @param oAuthConsumerLocalService the o auth consumer local service
	 */
	public void setOAuthConsumerLocalService(
		OAuthConsumerLocalService oAuthConsumerLocalService) {
		this.oAuthConsumerLocalService = oAuthConsumerLocalService;
	}

	/**
	 * Gets the o auth consumer persistence.
	 *
	 * @return the o auth consumer persistence
	 */
	public OAuthConsumerPersistence getOAuthConsumerPersistence() {
		return oAuthConsumerPersistence;
	}

	/**
	 * Sets the o auth consumer persistence.
	 *
	 * @param oAuthConsumerPersistence the o auth consumer persistence
	 */
	public void setOAuthConsumerPersistence(
		OAuthConsumerPersistence oAuthConsumerPersistence) {
		this.oAuthConsumerPersistence = oAuthConsumerPersistence;
	}

	/**
	 * Gets the o auth token local service.
	 *
	 * @return the o auth token local service
	 */
	public OAuthTokenLocalService getOAuthTokenLocalService() {
		return oAuthTokenLocalService;
	}

	/**
	 * Sets the o auth token local service.
	 *
	 * @param oAuthTokenLocalService the o auth token local service
	 */
	public void setOAuthTokenLocalService(
		OAuthTokenLocalService oAuthTokenLocalService) {
		this.oAuthTokenLocalService = oAuthTokenLocalService;
	}

	/**
	 * Gets the o auth token persistence.
	 *
	 * @return the o auth token persistence
	 */
	public OAuthTokenPersistence getOAuthTokenPersistence() {
		return oAuthTokenPersistence;
	}

	/**
	 * Sets the o auth token persistence.
	 *
	 * @param oAuthTokenPersistence the o auth token persistence
	 */
	public void setOAuthTokenPersistence(
		OAuthTokenPersistence oAuthTokenPersistence) {
		this.oAuthTokenPersistence = oAuthTokenPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = oAuthConsumerPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = GadgetLocalService.class)
	protected GadgetLocalService gadgetLocalService;
	@BeanReference(type = GadgetPersistence.class)
	protected GadgetPersistence gadgetPersistence;
	@BeanReference(type = OAuthConsumerLocalService.class)
	protected OAuthConsumerLocalService oAuthConsumerLocalService;
	@BeanReference(type = OAuthConsumerPersistence.class)
	protected OAuthConsumerPersistence oAuthConsumerPersistence;
	@BeanReference(type = OAuthTokenLocalService.class)
	protected OAuthTokenLocalService oAuthTokenLocalService;
	@BeanReference(type = OAuthTokenPersistence.class)
	protected OAuthTokenPersistence oAuthTokenPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}