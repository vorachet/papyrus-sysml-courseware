/**
 */
package HSUVModel;

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
 * @see HSUVModel.HSUVModelFactory
 * @model kind="package"
 * @generated
 */
public interface HSUVModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HSUVModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///HSUVModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HSUVModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HSUVModelPackage eINSTANCE = HSUVModel.impl.HSUVModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link HSUVModel.impl.HybridSUVImpl <em>Hybrid SUV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.HybridSUVImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getHybridSUV()
	 * @generated
	 */
	int HYBRID_SUV = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__P = 0;

	/**
	 * The feature id for the '<em><b></b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV__ = 1;

	/**
	 * The number of structural features of the '<em>Hybrid SUV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_SUV_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.PowerSubSystemImpl <em>Power Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.PowerSubSystemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getPowerSubSystem()
	 * @generated
	 */
	int POWER_SUB_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b></b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUB_SYSTEM__ = 0;

	/**
	 * The number of structural features of the '<em>Power Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUB_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.WheelHubAssemblyImpl <em>Wheel Hub Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.WheelHubAssemblyImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getWheelHubAssembly()
	 * @generated
	 */
	int WHEEL_HUB_ASSEMBLY = 2;

	/**
	 * The number of structural features of the '<em>Wheel Hub Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_HUB_ASSEMBLY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.BrakePedalImpl <em>Brake Pedal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.BrakePedalImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getBrakePedal()
	 * @generated
	 */
	int BRAKE_PEDAL = 3;

	/**
	 * The number of structural features of the '<em>Brake Pedal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAKE_PEDAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.BreakSubsystemImpl <em>Break Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.BreakSubsystemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getBreakSubsystem()
	 * @generated
	 */
	int BREAK_SUBSYSTEM = 4;

	/**
	 * The feature id for the '<em><b></b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SUBSYSTEM__ = 0;

	/**
	 * The number of structural features of the '<em>Break Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_SUBSYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.BodySubsystemImpl <em>Body Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.BodySubsystemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getBodySubsystem()
	 * @generated
	 */
	int BODY_SUBSYSTEM = 5;

	/**
	 * The number of structural features of the '<em>Body Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.InteriorSubsystemImpl <em>Interior Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.InteriorSubsystemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getInteriorSubsystem()
	 * @generated
	 */
	int INTERIOR_SUBSYSTEM = 6;

	/**
	 * The number of structural features of the '<em>Interior Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.LightingSubsystemImpl <em>Lighting Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.LightingSubsystemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getLightingSubsystem()
	 * @generated
	 */
	int LIGHTING_SUBSYSTEM = 7;

	/**
	 * The number of structural features of the '<em>Lighting Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHTING_SUBSYSTEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.impl.ChassisSubsytemImpl <em>Chassis Subsytem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.impl.ChassisSubsytemImpl
	 * @see HSUVModel.impl.HSUVModelPackageImpl#getChassisSubsytem()
	 * @generated
	 */
	int CHASSIS_SUBSYTEM = 8;

	/**
	 * The feature id for the '<em><b></b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHASSIS_SUBSYTEM__ = 0;

	/**
	 * The number of structural features of the '<em>Chassis Subsytem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHASSIS_SUBSYTEM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link HSUVModel.HybridSUV <em>Hybrid SUV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid SUV</em>'.
	 * @see HSUVModel.HybridSUV
	 * @generated
	 */
	EClass getHybridSUV();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HybridSUV#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see HSUVModel.HybridSUV#getP()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV_P();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.HybridSUV#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em></em>'.
	 * @see HSUVModel.HybridSUV#get_()
	 * @see #getHybridSUV()
	 * @generated
	 */
	EReference getHybridSUV__();

	/**
	 * Returns the meta object for class '{@link HSUVModel.PowerSubSystem <em>Power Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Sub System</em>'.
	 * @see HSUVModel.PowerSubSystem
	 * @generated
	 */
	EClass getPowerSubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link HSUVModel.PowerSubSystem#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em></em>'.
	 * @see HSUVModel.PowerSubSystem#get_()
	 * @see #getPowerSubSystem()
	 * @generated
	 */
	EReference getPowerSubSystem__();

	/**
	 * Returns the meta object for class '{@link HSUVModel.WheelHubAssembly <em>Wheel Hub Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Hub Assembly</em>'.
	 * @see HSUVModel.WheelHubAssembly
	 * @generated
	 */
	EClass getWheelHubAssembly();

	/**
	 * Returns the meta object for class '{@link HSUVModel.BrakePedal <em>Brake Pedal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brake Pedal</em>'.
	 * @see HSUVModel.BrakePedal
	 * @generated
	 */
	EClass getBrakePedal();

	/**
	 * Returns the meta object for class '{@link HSUVModel.BreakSubsystem <em>Break Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Subsystem</em>'.
	 * @see HSUVModel.BreakSubsystem
	 * @generated
	 */
	EClass getBreakSubsystem();

	/**
	 * Returns the meta object for the containment reference '{@link HSUVModel.BreakSubsystem#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em></em>'.
	 * @see HSUVModel.BreakSubsystem#get_()
	 * @see #getBreakSubsystem()
	 * @generated
	 */
	EReference getBreakSubsystem__();

	/**
	 * Returns the meta object for class '{@link HSUVModel.BodySubsystem <em>Body Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Subsystem</em>'.
	 * @see HSUVModel.BodySubsystem
	 * @generated
	 */
	EClass getBodySubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.InteriorSubsystem <em>Interior Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interior Subsystem</em>'.
	 * @see HSUVModel.InteriorSubsystem
	 * @generated
	 */
	EClass getInteriorSubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.LightingSubsystem <em>Lighting Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lighting Subsystem</em>'.
	 * @see HSUVModel.LightingSubsystem
	 * @generated
	 */
	EClass getLightingSubsystem();

	/**
	 * Returns the meta object for class '{@link HSUVModel.ChassisSubsytem <em>Chassis Subsytem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chassis Subsytem</em>'.
	 * @see HSUVModel.ChassisSubsytem
	 * @generated
	 */
	EClass getChassisSubsytem();

	/**
	 * Returns the meta object for the containment reference list '{@link HSUVModel.ChassisSubsytem#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em></em>'.
	 * @see HSUVModel.ChassisSubsytem#get_()
	 * @see #getChassisSubsytem()
	 * @generated
	 */
	EReference getChassisSubsytem__();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HSUVModelFactory getHSUVModelFactory();

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
		 * The meta object literal for the '{@link HSUVModel.impl.HybridSUVImpl <em>Hybrid SUV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.HybridSUVImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getHybridSUV()
		 * @generated
		 */
		EClass HYBRID_SUV = eINSTANCE.getHybridSUV();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__P = eINSTANCE.getHybridSUV_P();

		/**
		 * The meta object literal for the '<em><b></b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_SUV__ = eINSTANCE.getHybridSUV__();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.PowerSubSystemImpl <em>Power Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.PowerSubSystemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getPowerSubSystem()
		 * @generated
		 */
		EClass POWER_SUB_SYSTEM = eINSTANCE.getPowerSubSystem();

		/**
		 * The meta object literal for the '<em><b></b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SUB_SYSTEM__ = eINSTANCE.getPowerSubSystem__();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.WheelHubAssemblyImpl <em>Wheel Hub Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.WheelHubAssemblyImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getWheelHubAssembly()
		 * @generated
		 */
		EClass WHEEL_HUB_ASSEMBLY = eINSTANCE.getWheelHubAssembly();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.BrakePedalImpl <em>Brake Pedal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.BrakePedalImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getBrakePedal()
		 * @generated
		 */
		EClass BRAKE_PEDAL = eINSTANCE.getBrakePedal();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.BreakSubsystemImpl <em>Break Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.BreakSubsystemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getBreakSubsystem()
		 * @generated
		 */
		EClass BREAK_SUBSYSTEM = eINSTANCE.getBreakSubsystem();

		/**
		 * The meta object literal for the '<em><b></b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_SUBSYSTEM__ = eINSTANCE.getBreakSubsystem__();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.BodySubsystemImpl <em>Body Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.BodySubsystemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getBodySubsystem()
		 * @generated
		 */
		EClass BODY_SUBSYSTEM = eINSTANCE.getBodySubsystem();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.InteriorSubsystemImpl <em>Interior Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.InteriorSubsystemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getInteriorSubsystem()
		 * @generated
		 */
		EClass INTERIOR_SUBSYSTEM = eINSTANCE.getInteriorSubsystem();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.LightingSubsystemImpl <em>Lighting Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.LightingSubsystemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getLightingSubsystem()
		 * @generated
		 */
		EClass LIGHTING_SUBSYSTEM = eINSTANCE.getLightingSubsystem();

		/**
		 * The meta object literal for the '{@link HSUVModel.impl.ChassisSubsytemImpl <em>Chassis Subsytem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.impl.ChassisSubsytemImpl
		 * @see HSUVModel.impl.HSUVModelPackageImpl#getChassisSubsytem()
		 * @generated
		 */
		EClass CHASSIS_SUBSYTEM = eINSTANCE.getChassisSubsytem();

		/**
		 * The meta object literal for the '<em><b></b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHASSIS_SUBSYTEM__ = eINSTANCE.getChassisSubsytem__();

	}

} //HSUVModelPackage
