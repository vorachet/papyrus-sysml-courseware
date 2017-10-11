/**
 */
package HSUVModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid SUV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HybridSUV#getP <em>P</em>}</li>
 *   <li>{@link HSUVModel.HybridSUV#get_ <em></em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVModelPackage#getHybridSUV()
 * @model
 * @generated
 */
public interface HybridSUV extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(PowerSubSystem)
	 * @see HSUVModel.HSUVModelPackage#getHybridSUV_P()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PowerSubSystem getP();

	/**
	 * Sets the value of the '{@link HSUVModel.HybridSUV#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(PowerSubSystem value);

	/**
	 * Returns the value of the '<em><b></b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em></em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' containment reference.
	 * @see #set_(BreakSubsystem)
	 * @see HSUVModel.HSUVModelPackage#getHybridSUV__()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BreakSubsystem get_();

	/**
	 * Sets the value of the '{@link HSUVModel.HybridSUV#get_ <em></em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em></em>' containment reference.
	 * @see #get_()
	 * @generated
	 */
	void set_(BreakSubsystem value);

} // HybridSUV
