/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.mbmessage;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class MBMessageService extends BaseService {

	public MBMessageService(Session session) {
		super(session);
	}

	public JSONObject addDiscussionMessage(long groupId, String className, long classPK, String permissionClassName, long permissionClassPK, long permissionOwnerId, long threadId, long parentMessageId, String subject, String body, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("permissionClassName", permissionClassName);
			_params.put("permissionClassPK", permissionClassPK);
			_params.put("permissionOwnerId", permissionOwnerId);
			_params.put("threadId", threadId);
			_params.put("parentMessageId", parentMessageId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/add-discussion-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addMessage(long groupId, long categoryId, String subject, String body, String format, JSONArray inputStreamOVPs, boolean anonymous, double priority, boolean allowPingbacks, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("format", format);
			_params.put("inputStreamOVPs", inputStreamOVPs);
			_params.put("anonymous", anonymous);
			_params.put("priority", priority);
			_params.put("allowPingbacks", allowPingbacks);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/add-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addMessage(long groupId, long categoryId, long threadId, long parentMessageId, String subject, String body, String format, JSONArray inputStreamOVPs, boolean anonymous, double priority, boolean allowPingbacks, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("threadId", threadId);
			_params.put("parentMessageId", parentMessageId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("format", format);
			_params.put("inputStreamOVPs", inputStreamOVPs);
			_params.put("anonymous", anonymous);
			_params.put("priority", priority);
			_params.put("allowPingbacks", allowPingbacks);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/add-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addMessage(long categoryId, String subject, String body, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/add-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addMessage(long parentMessageId, String subject, String body, String format, JSONArray inputStreamOVPs, boolean anonymous, double priority, boolean allowPingbacks, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentMessageId", parentMessageId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("format", format);
			_params.put("inputStreamOVPs", inputStreamOVPs);
			_params.put("anonymous", anonymous);
			_params.put("priority", priority);
			_params.put("allowPingbacks", allowPingbacks);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/add-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteDiscussionMessage(long groupId, String className, long classPK, String permissionClassName, long permissionClassPK, long permissionOwnerId, long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("permissionClassName", permissionClassName);
			_params.put("permissionClassPK", permissionClassPK);
			_params.put("permissionOwnerId", permissionOwnerId);
			_params.put("messageId", messageId);

			_command.put("/mbmessage/delete-discussion-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteMessage(long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);

			_command.put("/mbmessage/delete-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteMessageAttachments(long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);

			_command.put("/mbmessage/delete-message-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getCategoryMessages(long groupId, long categoryId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/mbmessage/get-category-messages", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getCategoryMessagesCount(long groupId, long categoryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("status", status);

			_command.put("/mbmessage/get-category-messages-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public String getCategoryMessagesRss(long groupId, long categoryId, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/mbmessage/get-category-messages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public String getCompanyMessagesRss(long companyId, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/mbmessage/get-company-messages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public Integer getGroupMessagesCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/mbmessage/get-group-messages-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public String getGroupMessagesRss(long groupId, long userId, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/mbmessage/get-group-messages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public String getGroupMessagesRss(long groupId, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/mbmessage/get-group-messages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public JSONObject getMessage(long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);

			_command.put("/mbmessage/get-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getMessageDisplay(long messageId, int status, String threadView, boolean includePrevAndNext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);
			_params.put("status", status);
			_params.put("threadView", threadView);
			_params.put("includePrevAndNext", includePrevAndNext);

			_command.put("/mbmessage/get-message-display", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Integer getThreadAnswersCount(long groupId, long categoryId, long threadId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("threadId", threadId);

			_command.put("/mbmessage/get-thread-answers-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getThreadMessages(long groupId, long categoryId, long threadId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("threadId", threadId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/mbmessage/get-thread-messages", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getThreadMessagesCount(long groupId, long categoryId, long threadId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("threadId", threadId);
			_params.put("status", status);

			_command.put("/mbmessage/get-thread-messages-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public String getThreadMessagesRss(long threadId, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("threadId", threadId);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/mbmessage/get-thread-messages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public void restoreMessageAttachmentFromTrash(long messageId, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);
			_params.put("fileName", fileName);

			_command.put("/mbmessage/restore-message-attachment-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void subscribeMessage(long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);

			_command.put("/mbmessage/subscribe-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsubscribeMessage(long messageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);

			_command.put("/mbmessage/unsubscribe-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void updateAnswer(long messageId, boolean answer, boolean cascade) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);
			_params.put("answer", answer);
			_params.put("cascade", cascade);

			_command.put("/mbmessage/update-answer", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateDiscussionMessage(String className, long classPK, String permissionClassName, long permissionClassPK, long permissionOwnerId, long messageId, String subject, String body, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("permissionClassName", permissionClassName);
			_params.put("permissionClassPK", permissionClassPK);
			_params.put("permissionOwnerId", permissionOwnerId);
			_params.put("messageId", messageId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/update-discussion-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateMessage(long messageId, String subject, String body, JSONArray inputStreamOVPs, JSONArray existingFiles, double priority, boolean allowPingbacks, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("messageId", messageId);
			_params.put("subject", subject);
			_params.put("body", body);
			_params.put("inputStreamOVPs", inputStreamOVPs);
			_params.put("existingFiles", existingFiles);
			_params.put("priority", priority);
			_params.put("allowPingbacks", allowPingbacks);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbmessage/update-message", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}