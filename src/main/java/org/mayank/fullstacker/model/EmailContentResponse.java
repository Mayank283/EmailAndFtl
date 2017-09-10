/**
 * 
 */
package org.mayank.fullstacker.model;

/**
 * @author agarwalm
 *
 */
public class EmailContentResponse {

	/**
	 * 
	 */
	private String Body;

	/**
	 * 
	 */
	private String signature;

	/**
	 * @return
	 */
	public String getBody() {
		return Body;
	}

	/**
	 * @param body
	 */
	public void setBody(String body) {
		Body = body;
	}

	/**
	 * @return
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}
}
