/**
 */
package HSUVModel.HSUVStructure;

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
 *   <li>{@link HSUVModel.HSUVStructure.BreakSubsystem#getBrakePedal <em>Brake Pedal</em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#getBreakSubsystem()
 * @model
 * @generated
 */
public interface BreakSubsystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Brake Pedal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brake Pedal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brake Pedal</em>' containment reference.
	 * @see #setBrakePedal(BrakePedal)
	 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#getBreakSubsystem_BrakePedal()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BrakePedal getBrakePedal();

	/**
	 * Sets the value of the '{@link HSUVModel.HSUVStructure.BreakSubsystem#getBrakePedal <em>Brake Pedal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brake Pedal</em>' containment reference.
	 * @see #getBrakePedal()
	 * @generated
	 */
	void setBrakePedal(BrakePedal value);

} // BreakSubsystem
