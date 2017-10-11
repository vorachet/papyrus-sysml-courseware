/**
 */
package HSUVModel;

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
 *   <li>{@link HSUVModel.PowerSubSystem#get_ <em></em>}</li>
 * </ul>
 *
 * @see HSUVModel.HSUVModelPackage#getPowerSubSystem()
 * @model
 * @generated
 */
public interface PowerSubSystem extends EObject {
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
	 * @see HSUVModel.HSUVModelPackage#getPowerSubSystem__()
	 * @model type="HSUVModel.WheelHubAssembly" containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList get_();

} // PowerSubSystem
