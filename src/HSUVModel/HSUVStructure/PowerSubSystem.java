/**
 */
package HSUVModel.HSUVStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HSUVStructure.PowerSubSystem#getWheelHubAssembly <em>Wheel Hub Assembly</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.PowerSubSystem#getBrakePedal <em>Brake Pedal</em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#getPowerSubSystem()
 * @model
 * @generated
 */
public interface PowerSubSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Wheel Hub Assembly</b></em>' containment reference list.
	 * The list contents are of type {@link HSUVModel.HSUVStructure.WheelHubAssembly}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wheel Hub Assembly</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheel Hub Assembly</em>' containment reference list.
	 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#getPowerSubSystem_WheelHubAssembly()
	 * @model type="HSUVModel.HSUVStructure.WheelHubAssembly" containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList getWheelHubAssembly();

	/**
	 * Returns the value of the '<em><b>Brake Pedal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brake Pedal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brake Pedal</em>' reference.
	 * @see #setBrakePedal(BrakePedal)
	 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#getPowerSubSystem_BrakePedal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BrakePedal getBrakePedal();

	/**
	 * Sets the value of the '{@link HSUVModel.HSUVStructure.PowerSubSystem#getBrakePedal <em>Brake Pedal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brake Pedal</em>' reference.
	 * @see #getBrakePedal()
	 * @generated
	 */
	void setBrakePedal(BrakePedal value);

} // PowerSubSystem
