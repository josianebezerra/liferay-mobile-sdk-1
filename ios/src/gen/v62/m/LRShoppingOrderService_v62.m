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

#import "LRShoppingOrderService_v62.h"

/**
 * @author Bruno Farache
 */
@implementation LRShoppingOrderService_v62

- (void)completeOrderWithGroupId:(long long)groupId number:(NSString *)number ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(double)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"number": number,
		@"ppTxnId": ppTxnId,
		@"ppPaymentStatus": ppPaymentStatus,
		@"ppPaymentGross": @(ppPaymentGross),
		@"ppReceiverEmail": ppReceiverEmail,
		@"ppPayerEmail": ppPayerEmail,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingorder/complete-order": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteOrderWithGroupId:(long long)groupId orderId:(long long)orderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"orderId": @(orderId)
	};

	NSDictionary *_command = @{@"/shoppingorder/delete-order": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getOrderWithGroupId:(long long)groupId orderId:(long long)orderId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"orderId": @(orderId)
	};

	NSDictionary *_command = @{@"/shoppingorder/get-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)sendEmailWithGroupId:(long long)groupId orderId:(long long)orderId emailType:(NSString *)emailType serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"orderId": @(orderId),
		@"emailType": emailType,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingorder/send-email": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateOrderWithGroupId:(long long)groupId orderId:(long long)orderId billingFirstName:(NSString *)billingFirstName billingLastName:(NSString *)billingLastName billingEmailAddress:(NSString *)billingEmailAddress billingCompany:(NSString *)billingCompany billingStreet:(NSString *)billingStreet billingCity:(NSString *)billingCity billingState:(NSString *)billingState billingZip:(NSString *)billingZip billingCountry:(NSString *)billingCountry billingPhone:(NSString *)billingPhone shipToBilling:(BOOL)shipToBilling shippingFirstName:(NSString *)shippingFirstName shippingLastName:(NSString *)shippingLastName shippingEmailAddress:(NSString *)shippingEmailAddress shippingCompany:(NSString *)shippingCompany shippingStreet:(NSString *)shippingStreet shippingCity:(NSString *)shippingCity shippingState:(NSString *)shippingState shippingZip:(NSString *)shippingZip shippingCountry:(NSString *)shippingCountry shippingPhone:(NSString *)shippingPhone ccName:(NSString *)ccName ccType:(NSString *)ccType ccNumber:(NSString *)ccNumber ccExpMonth:(int)ccExpMonth ccExpYear:(int)ccExpYear ccVerNumber:(NSString *)ccVerNumber comments:(NSString *)comments error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"orderId": @(orderId),
		@"billingFirstName": billingFirstName,
		@"billingLastName": billingLastName,
		@"billingEmailAddress": billingEmailAddress,
		@"billingCompany": billingCompany,
		@"billingStreet": billingStreet,
		@"billingCity": billingCity,
		@"billingState": billingState,
		@"billingZip": billingZip,
		@"billingCountry": billingCountry,
		@"billingPhone": billingPhone,
		@"shipToBilling": @(shipToBilling),
		@"shippingFirstName": shippingFirstName,
		@"shippingLastName": shippingLastName,
		@"shippingEmailAddress": shippingEmailAddress,
		@"shippingCompany": shippingCompany,
		@"shippingStreet": shippingStreet,
		@"shippingCity": shippingCity,
		@"shippingState": shippingState,
		@"shippingZip": shippingZip,
		@"shippingCountry": shippingCountry,
		@"shippingPhone": shippingPhone,
		@"ccName": ccName,
		@"ccType": ccType,
		@"ccNumber": ccNumber,
		@"ccExpMonth": @(ccExpMonth),
		@"ccExpYear": @(ccExpYear),
		@"ccVerNumber": ccVerNumber,
		@"comments": comments
	};

	NSDictionary *_command = @{@"/shoppingorder/update-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateOrderWithGroupId:(long long)groupId orderId:(long long)orderId ppTxnId:(NSString *)ppTxnId ppPaymentStatus:(NSString *)ppPaymentStatus ppPaymentGross:(double)ppPaymentGross ppReceiverEmail:(NSString *)ppReceiverEmail ppPayerEmail:(NSString *)ppPayerEmail error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"orderId": @(orderId),
		@"ppTxnId": ppTxnId,
		@"ppPaymentStatus": ppPaymentStatus,
		@"ppPaymentGross": @(ppPaymentGross),
		@"ppReceiverEmail": ppReceiverEmail,
		@"ppPayerEmail": ppPayerEmail
	};

	NSDictionary *_command = @{@"/shoppingorder/update-order": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end