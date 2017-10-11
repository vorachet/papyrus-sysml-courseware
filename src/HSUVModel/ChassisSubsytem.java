/**
 */
package HSUVModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chassis Subsytem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.ChassisSubsytem#get_ <em></em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVModelPackage#getChassisSubsytem()
 * @model
 * @generated
 */
public interface ChassisSubsytem extends EObject {
	/**
	 * Returns the value of the '<em><b></b></em>' containment reference list.
	 * The list contents are of type {@link HSUVModel.WheelHubAssembly}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em></em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' containment reference list.
	 * @see HSUVModel.HSUVModelPackage#getChassisSubsytem__()
	 * @model type="HSUVModel.WheelHubAssembly" containment="true" lower="4" upper="4" ordered="false"
	 * @generated
	 */
	EList get_();

} // ChassisSubsytem
