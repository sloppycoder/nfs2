package com.fictional.ibank.card.ccms.xmlmodel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2015-11-14T18:16:58.788+08:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://services.cards.common.scb", name = "CardCustomerService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CardCustomerService {

    @WebMethod(action = "enquireCardCustomer")
    @WebResult(name = "EnquireCardCustomer", targetNamespace = "http://entity.cards.common.scb", partName = "creditCardResponse")
    public CardCustomer enquireCardCustomer(
        @WebParam(partName = "serviceHeader", name = "ServiceHeader", targetNamespace = "http://entity.service.common.scb", header = true)
        ServiceHeader serviceHeader,
        @WebParam(partName = "enquireCardCustomer", name = "EnquireCardCustomer", targetNamespace = "http://entity.cards.common.scb")
        CardCustomer enquireCardCustomer
    ) throws SecurityFault_Exception, ServiceFault_Exception;

    @WebMethod(action = "getMerchantDetails")
    @WebResult(name = "GetMerchantDetails", targetNamespace = "http://entity.cards.common.scb", partName = "getMerchantDetailsRs")
    public CreditCard getMerchantDetails(
        @WebParam(partName = "serviceheader", name = "ServiceHeader", targetNamespace = "http://entity.service.common.scb", header = true)
        ServiceHeader serviceheader,
        @WebParam(partName = "getMerchantDetailsRq", name = "GetMerchantDetails", targetNamespace = "http://entity.cards.common.scb")
        CreditCard getMerchantDetailsRq
    ) throws SecurityFault_Exception, ServiceFault_Exception;

    @WebMethod(action = "getRewardRedemptionDetails")
    @WebResult(name = "GetRewardRedemptionDetails", targetNamespace = "http://entity.cards.common.scb", partName = "getRewardRedemptionDetailsRs")
    public CardCustomer getRewardRedemptionDetails(
        @WebParam(partName = "serviceheader", name = "ServiceHeader", targetNamespace = "http://entity.service.common.scb", header = true)
        ServiceHeader serviceheader,
        @WebParam(partName = "getRewardRedemptionDetailsRq", name = "GetRewardRedemptionDetails", targetNamespace = "http://entity.cards.common.scb")
        CardCustomer getRewardRedemptionDetailsRq
    ) throws SecurityFault_Exception, ServiceFault_Exception;

    @WebMethod(action = "enquireLinkedCards")
    @WebResult(name = "EnquireLinkedCards", targetNamespace = "http://entity.cards.common.scb", partName = "creditCardResponse")
    public CardCustomer enquireLinkedCards(
        @WebParam(partName = "serviceHeader", name = "ServiceHeader", targetNamespace = "http://entity.service.common.scb", header = true)
        ServiceHeader serviceHeader,
        @WebParam(partName = "enquireLinkedCards", name = "EnquireLinkedCards", targetNamespace = "http://entity.cards.common.scb")
        CardCustomer enquireLinkedCards
    ) throws SecurityFault_Exception, ServiceFault_Exception;

    @WebMethod(action = "getCustomerRewardPointsSummary")
    @WebResult(name = "GetCustomerRewardPointsSummary", targetNamespace = "http://entity.cards.common.scb", partName = "getCustomerRewardPointsSummaryRs")
    public CardCustomer getCustomerRewardPointsSummary(
        @WebParam(partName = "serviceHeader", name = "ServiceHeader", targetNamespace = "http://entity.service.common.scb", header = true)
        ServiceHeader serviceHeader,
        @WebParam(partName = "getCustomerRewardPointsSummaryRq", name = "GetCustomerRewardPointsSummary", targetNamespace = "http://entity.cards.common.scb")
        CardCustomer getCustomerRewardPointsSummaryRq
    ) throws SecurityFault_Exception, ServiceFault_Exception;
}
