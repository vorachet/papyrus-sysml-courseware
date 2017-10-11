/**
 */
package HSUVModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.BreakSubsystem#get_ <em></em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVModelPackage#getBreakSubsystem()
 * @model
 * @generated
 */
public interface BreakSubsystem extends EObject {
	/**
	 * Returns the value of the '<em><b></b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em></em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' containment reference.
	 * @see #set_(BrakePedal)
	 * @see HSUVModel.HSUVModelPackage#getBreakSubsystem__()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BrakePedal get_();

	/**
	 * Sets the value of the '{@link HSUVModel.BreakSubsystem#get_ <em></em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em></em>' containment reference.
	 * @see #get_()
	 * @generated
	 */
	void set_(BrakePedal value);

} // BreakSubsystem
