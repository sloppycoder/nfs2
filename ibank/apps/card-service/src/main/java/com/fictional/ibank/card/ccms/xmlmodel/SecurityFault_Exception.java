
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4
 * 2015-11-14T18:16:58.776+08:00
 * Generated source version: 3.1.4
 */

@WebFault(name = "SecurityFault", targetNamespace = "http://fault.service.common.scb")
public class SecurityFault_Exception extends Exception {
    
    private com.fictional.ibank.card.ccms.xmlmodel.SecurityFault securityFault;

    public SecurityFault_Exception() {
        super();
    }
    
    public SecurityFault_Exception(String message) {
        super(message);
    }
    
    public SecurityFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityFault_Exception(String message, com.fictional.ibank.card.ccms.xmlmodel.SecurityFault securityFault) {
        super(message);
        this.securityFault = securityFault;
    }

    public SecurityFault_Exception(String message, com.fictional.ibank.card.ccms.xmlmodel.SecurityFault securityFault, Throwable cause) {
        super(message, cause);
        this.securityFault = securityFault;
    }

    public com.fictional.ibank.card.ccms.xmlmodel.SecurityFault getFaultInfo() {
        return this.securityFault;
    }
}
