/**
 */
package HSUVModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVModelPackage
 * @generated
 */
public interface HSUVModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HSUVModelFactory eINSTANCE = HSUVModel.impl.HSUVModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hybrid SUV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid SUV</em>'.
	 * @generated
	 */
	HybridSUV createHybridSUV();

	/**
	 * Returns a new object of class '<em>Power Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Sub System</em>'.
	 * @generated
	 */
	PowerSubSystem createPowerSubSystem();

	/**
	 * Returns a new object of class '<em>Wheel Hub Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Hub Assembly</em>'.
	 * @generated
	 */
	WheelHubAssembly createWheelHubAssembly();

	/**
	 * Returns a new object of class '<em>Brake Pedal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brake Pedal</em>'.
	 * @generated
	 */
	BrakePedal createBrakePedal();

	/**
	 * Returns a new object of class '<em>Break Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Subsystem</em>'.
	 * @generated
	 */
	BreakSubsystem createBreakSubsystem();

	/**
	 * Returns a new object of class '<em>Body Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Subsystem</em>'.
	 * @generated
	 */
	BodySubsystem createBodySubsystem();

	/**
	 * Returns a new object of class '<em>Interior Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interior Subsystem</em>'.
	 * @generated
	 */
	InteriorSubsystem createInteriorSubsystem();

	/**
	 * Returns a new object of class '<em>Lighting Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lighting Subsystem</em>'.
	 * @generated
	 */
	LightingSubsystem createLightingSubsystem();

	/**
	 * Returns a new object of class '<em>Chassis Subsytem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chassis Subsytem</em>'.
	 * @generated
	 */
	ChassisSubsytem createChassisSubsytem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HSUVModelPackage getHSUVModelPackage();

} //HSUVModelFactory
