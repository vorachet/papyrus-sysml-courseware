/**
 */
package HSUVModel.HSUVStructure;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVStructure.HSUVStructureFactory
 * @model kind="package"
 * @generated
 */
public interface HSUVStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HSUVStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///HSUVModel/HSUVStructure.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HSUVModel.HSUVStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HSUVStructurePackage eINSTANCE = HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.AutomotiveDomainImpl <em>Automotive Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.AutomotiveDomainImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getAutomotiveDomain()
	 * @generated
	 */
	int AUTOMOTIVE_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Automotive Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOTIVE_DOMAIN_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl <em>Hybrid SUV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.HybridSUVImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getHybridSUV()
	 * @generated
	 */
	int HYBRID_SUV = 1;

	/**
	 * The feature id for the '<em><b>Power Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__POWER_SUBSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Break Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__BREAK_SUBSYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Body Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__BODY_SUBSYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Interior Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__INTERIOR_SUBSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Lighting Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__LIGHTING_SUBSYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Chassis Subsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__CHASSIS_SUBSYSTEM = 5;

	/**
	 * The number of structural features of the '<em>Hybrid SUV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.PowerSubSystemImpl <em>Power Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.PowerSubSystemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getPowerSubSystem()
	 * @generated
	 */
	int POWER_SUB_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Wheel Hub Assembly</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY = 0;

	/**
	 * The feature id for the '<em><b>Brake Pedal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUB_SYSTEM__BRAKE_PEDAL = 1;

	/**
	 * The number of structural features of the '<em>Power Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUB_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.WheelHubAssemblyImpl <em>Wheel Hub Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.WheelHubAssemblyImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getWheelHubAssembly()
	 * @generated
	 */
	int WHEEL_HUB_ASSEMBLY = 3;

	/**
	 * The number of structural features of the '<em>Wheel Hub Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_HUB_ASSEMBLY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.BrakePedalImpl <em>Brake Pedal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.BrakePedalImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBrakePedal()
	 * @generated
	 */
	int BRAKE_PEDAL = 4;

	/**
	 * The number of structural features of the '<em>Brake Pedal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAKE_PEDAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.BreakSubsystemImpl <em>Break Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.BreakSubsystemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBreakSubsystem()
	 * @generated
	 */
	int BREAK_SUBSYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Brake Pedal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SUBSYSTEM__BRAKE_PEDAL = 0;

	/**
	 * The number of structural features of the '<em>Break Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SUBSYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.BodySubsystemImpl <em>Body Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.BodySubsystemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBodySubsystem()
	 * @generated
	 */
	int BODY_SUBSYSTEM = 6;

	/**
	 * The number of structural features of the '<em>Body Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.InteriorSubsystemImpl <em>Interior Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.InteriorSubsystemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getInteriorSubsystem()
	 * @generated
	 */
	int INTERIOR_SUBSYSTEM = 7;

	/**
	 * The number of structural features of the '<em>Interior Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.LightingSubsystemImpl <em>Lighting Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.LightingSubsystemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getLightingSubsystem()
	 * @generated
	 */
	int LIGHTING_SUBSYSTEM = 8;

	/**
	 * The number of structural features of the '<em>Lighting Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVStructure.impl.ChassisSubsytemImpl <em>Chassis Subsytem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVStructure.impl.ChassisSubsytemImpl
	 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getChassisSubsytem()
	 * @generated
	 */
	int CHASSIS_SUBSYTEM = 9;

	/**
	 * The feature id for the '<em><b>Wheel Hub Assembly</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY = 0;

	/**
	 * The number of structural features of the '<em>Chassis Subsytem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHASSIS_SUBSYTEM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.AutomotiveDomain <em>Automotive Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automotive Domain</em>'.
	 * @see HSUVModel.HSUVStructure.AutomotiveDomain
	 * @generated
	 */
	EClass getAutomotiveDomain();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.HybridSUV <em>Hybrid SUV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid SUV</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV
	 * @generated
	 */
	EClass getHybridSUV();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getPowerSubsystem <em>Power Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getPowerSubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_PowerSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getBreakSubsystem <em>Break Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Break Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getBreakSubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_BreakSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getBodySubsystem <em>Body Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getBodySubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_BodySubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getInteriorSubsystem <em>Interior Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interior Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getInteriorSubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_InteriorSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getLightingSubsystem <em>Lighting Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lighting Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getLightingSubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_LightingSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.HybridSUV#getChassisSubsystem <em>Chassis Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chassis Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.HybridSUV#getChassisSubsystem()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_ChassisSubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.PowerSubSystem <em>Power Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Sub System</em>'.
	 * @see HSUVModel.HSUVStructure.PowerSubSystem
	 * @generated
	 */
	EClass getPowerSubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link HSUVModel.HSUVStructure.PowerSubSystem#getWheelHubAssembly <em>Wheel Hub Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wheel Hub Assembly</em>'.
	 * @see HSUVModel.HSUVStructure.PowerSubSystem#getWheelHubAssembly()
	 * @see #getPowerSubSystem()
	 * @generated
	 */
	EReference getPowerSubSystem_WheelHubAssembly();

	/**
	 * Returns the meta object for the reference '{@link HSUVModel.HSUVStructure.PowerSubSystem#getBrakePedal <em>Brake Pedal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brake Pedal</em>'.
	 * @see HSUVModel.HSUVStructure.PowerSubSystem#getBrakePedal()
	 * @see #getPowerSubSystem()
	 * @generated
	 */
	EReference getPowerSubSystem_BrakePedal();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.WheelHubAssembly <em>Wheel Hub Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Hub Assembly</em>'.
	 * @see HSUVModel.HSUVStructure.WheelHubAssembly
	 * @generated
	 */
	EClass getWheelHubAssembly();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.BrakePedal <em>Brake Pedal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brake Pedal</em>'.
	 * @see HSUVModel.HSUVStructure.BrakePedal
	 * @generated
	 */
	EClass getBrakePedal();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.BreakSubsystem <em>Break Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.BreakSubsystem
	 * @generated
	 */
	EClass getBreakSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HSUVStructure.BreakSubsystem#getBrakePedal <em>Brake Pedal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brake Pedal</em>'.
	 * @see HSUVModel.HSUVStructure.BreakSubsystem#getBrakePedal()
	 * @see #getBreakSubsystem()
	 * @generated
	 */
	EReference getBreakSubsystem_BrakePedal();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.BodySubsystem <em>Body Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.BodySubsystem
	 * @generated
	 */
	EClass getBodySubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.InteriorSubsystem <em>Interior Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interior Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.InteriorSubsystem
	 * @generated
	 */
	EClass getInteriorSubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.LightingSubsystem <em>Lighting Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lighting Subsystem</em>'.
	 * @see HSUVModel.HSUVStructure.LightingSubsystem
	 * @generated
	 */
	EClass getLightingSubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVStructure.ChassisSubsytem <em>Chassis Subsytem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chassis Subsytem</em>'.
	 * @see HSUVModel.HSUVStructure.ChassisSubsytem
	 * @generated
	 */
	EClass getChassisSubsytem();

	/**
	 * Returns the meta object for the containment reference list '{@link HSUVModel.HSUVStructure.ChassisSubsytem#getWheelHubAssembly <em>Wheel Hub Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wheel Hub Assembly</em>'.
	 * @see HSUVModel.HSUVStructure.ChassisSubsytem#getWheelHubAssembly()
	 * @see #getChassisSubsytem()
	 * @generated
	 */
	EReference getChassisSubsytem_WheelHubAssembly();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HSUVStructureFactory getHSUVStructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.AutomotiveDomainImpl <em>Automotive Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.AutomotiveDomainImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getAutomotiveDomain()
		 * @generated
		 */
		EClass AUTOMOTIVE_DOMAIN = eINSTANCE.getAutomotiveDomain();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.HybridSUVImpl <em>Hybrid SUV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.HybridSUVImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getHybridSUV()
		 * @generated
		 */
		EClass HYBRID_SUV = eINSTANCE.getHybridSUV();
		/**
		 * The meta object literal for the '<em><b>Power Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__POWER_SUBSYSTEM = eINSTANCE.getHybridSUV_PowerSubsystem();
		/**
		 * The meta object literal for the '<em><b>Break Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__BREAK_SUBSYSTEM = eINSTANCE.getHybridSUV_BreakSubsystem();
		/**
		 * The meta object literal for the '<em><b>Body Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__BODY_SUBSYSTEM = eINSTANCE.getHybridSUV_BodySubsystem();
		/**
		 * The meta object literal for the '<em><b>Interior Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__INTERIOR_SUBSYSTEM = eINSTANCE.getHybridSUV_InteriorSubsystem();
		/**
		 * The meta object literal for the '<em><b>Lighting Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__LIGHTING_SUBSYSTEM = eINSTANCE.getHybridSUV_LightingSubsystem();
		/**
		 * The meta object literal for the '<em><b>Chassis Subsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__CHASSIS_SUBSYSTEM = eINSTANCE.getHybridSUV_ChassisSubsystem();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.PowerSubSystemImpl <em>Power Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.PowerSubSystemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getPowerSubSystem()
		 * @generated
		 */
		EClass POWER_SUB_SYSTEM = eINSTANCE.getPowerSubSystem();
		/**
		 * The meta object literal for the '<em><b>Wheel Hub Assembly</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY = eINSTANCE.getPowerSubSystem_WheelHubAssembly();
		/**
		 * The meta object literal for the '<em><b>Brake Pedal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SUB_SYSTEM__BRAKE_PEDAL = eINSTANCE.getPowerSubSystem_BrakePedal();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.WheelHubAssemblyImpl <em>Wheel Hub Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.WheelHubAssemblyImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getWheelHubAssembly()
		 * @generated
		 */
		EClass WHEEL_HUB_ASSEMBLY = eINSTANCE.getWheelHubAssembly();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.BrakePedalImpl <em>Brake Pedal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.BrakePedalImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBrakePedal()
		 * @generated
		 */
		EClass BRAKE_PEDAL = eINSTANCE.getBrakePedal();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.BreakSubsystemImpl <em>Break Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.BreakSubsystemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBreakSubsystem()
		 * @generated
		 */
		EClass BREAK_SUBSYSTEM = eINSTANCE.getBreakSubsystem();
		/**
		 * The meta object literal for the '<em><b>Brake Pedal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_SUBSYSTEM__BRAKE_PEDAL = eINSTANCE.getBreakSubsystem_BrakePedal();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.BodySubsystemImpl <em>Body Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.BodySubsystemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getBodySubsystem()
		 * @generated
		 */
		EClass BODY_SUBSYSTEM = eINSTANCE.getBodySubsystem();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.InteriorSubsystemImpl <em>Interior Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.InteriorSubsystemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getInteriorSubsystem()
		 * @generated
		 */
		EClass INTERIOR_SUBSYSTEM = eINSTANCE.getInteriorSubsystem();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.LightingSubsystemImpl <em>Lighting Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.LightingSubsystemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getLightingSubsystem()
		 * @generated
		 */
		EClass LIGHTING_SUBSYSTEM = eINSTANCE.getLightingSubsystem();
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVStructure.impl.ChassisSubsytemImpl <em>Chassis Subsytem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVStructure.impl.ChassisSubsytemImpl
		 * @see HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl#getChassisSubsytem()
		 * @generated
		 */
		EClass CHASSIS_SUBSYTEM = eINSTANCE.getChassisSubsytem();
		/**
		 * The meta object literal for the '<em><b>Wheel Hub Assembly</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY = eINSTANCE.getChassisSubsytem_WheelHubAssembly();

	}

} //HSUVStructurePackage
