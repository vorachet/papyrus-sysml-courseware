/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVRequirements.HSUVRequirementsPackage;

import HSUVModel.HSUVRequirements.impl.HSUVRequirementsPackageImpl;

import HSUVModel.HSUVStructure.AutomotiveDomain;
import HSUVModel.HSUVStructure.BodySubsystem;
import HSUVModel.HSUVStructure.BrakePedal;
import HSUVModel.HSUVStructure.BreakSubsystem;
import HSUVModel.HSUVStructure.ChassisSubsytem;
import HSUVModel.HSUVStructure.HSUVStructureFactory;
import HSUVModel.HSUVStructure.HSUVStructurePackage;

import HSUVModel.HSUVStructure.HybridSUV;
import HSUVModel.HSUVStructure.InteriorSubsystem;
import HSUVModel.HSUVStructure.LightingSubsystem;
import HSUVModel.HSUVStructure.PowerSubSystem;
import HSUVModel.HSUVStructure.WheelHubAssembly;
import HSUVModel.HSUVViews.HSUVViewsPackage;

import HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HSUVStructurePackageImpl extends EPackageImpl implements HSUVStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automotiveDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridSUVEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSubSystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wheelHubAssemblyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brakePedalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakSubsystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySubsystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorSubsystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightingSubsystemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chassisSubsytemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see HSUVModel.HSUVStructure.HSUVStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HSUVStructurePackageImpl() {
		super(eNS_URI, HSUVStructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HSUVStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HSUVStructurePackage init() {
		if (isInited) return (HSUVStructurePackage)EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI);

		// Obtain or create and register package
		HSUVStructurePackageImpl theHSUVStructurePackage = (HSUVStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HSUVStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HSUVStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HSUVViewsPackageImpl theHSUVViewsPackage = (HSUVViewsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI) instanceof HSUVViewsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI) : HSUVViewsPackage.eINSTANCE);
		HSUVRequirementsPackageImpl theHSUVRequirementsPackage = (HSUVRequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) instanceof HSUVRequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) : HSUVRequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theHSUVStructurePackage.createPackageContents();
		theHSUVViewsPackage.createPackageContents();
		theHSUVRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theHSUVStructurePackage.initializePackageContents();
		theHSUVViewsPackage.initializePackageContents();
		theHSUVRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHSUVStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HSUVStructurePackage.eNS_URI, theHSUVStructurePackage);
		return theHSUVStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomotiveDomain() {
		return automotiveDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridSUV() {
		return hybridSUVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_PowerSubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_BreakSubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_BodySubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_InteriorSubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_LightingSubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV_ChassisSubsystem() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSubSystem() {
		return powerSubSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSubSystem_WheelHubAssembly() {
		return (EReference)powerSubSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSubSystem_BrakePedal() {
		return (EReference)powerSubSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWheelHubAssembly() {
		return wheelHubAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrakePedal() {
		return brakePedalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakSubsystem() {
		return breakSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakSubsystem_BrakePedal() {
		return (EReference)breakSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySubsystem() {
		return bodySubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteriorSubsystem() {
		return interiorSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightingSubsystem() {
		return lightingSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChassisSubsytem() {
		return chassisSubsytemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChassisSubsytem_WheelHubAssembly() {
		return (EReference)chassisSubsytemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVStructureFactory getHSUVStructureFactory() {
		return (HSUVStructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		automotiveDomainEClass = createEClass(AUTOMOTIVE_DOMAIN);

		hybridSUVEClass = createEClass(HYBRID_SUV);
		createEReference(hybridSUVEClass, HYBRID_SUV__POWER_SUBSYSTEM);
		createEReference(hybridSUVEClass, HYBRID_SUV__BREAK_SUBSYSTEM);
		createEReference(hybridSUVEClass, HYBRID_SUV__BODY_SUBSYSTEM);
		createEReference(hybridSUVEClass, HYBRID_SUV__INTERIOR_SUBSYSTEM);
		createEReference(hybridSUVEClass, HYBRID_SUV__LIGHTING_SUBSYSTEM);
		createEReference(hybridSUVEClass, HYBRID_SUV__CHASSIS_SUBSYSTEM);

		powerSubSystemEClass = createEClass(POWER_SUB_SYSTEM);
		createEReference(powerSubSystemEClass, POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY);
		createEReference(powerSubSystemEClass, POWER_SUB_SYSTEM__BRAKE_PEDAL);

		wheelHubAssemblyEClass = createEClass(WHEEL_HUB_ASSEMBLY);

		brakePedalEClass = createEClass(BRAKE_PEDAL);

		breakSubsystemEClass = createEClass(BREAK_SUBSYSTEM);
		createEReference(breakSubsystemEClass, BREAK_SUBSYSTEM__BRAKE_PEDAL);

		bodySubsystemEClass = createEClass(BODY_SUBSYSTEM);

		interiorSubsystemEClass = createEClass(INTERIOR_SUBSYSTEM);

		lightingSubsystemEClass = createEClass(LIGHTING_SUBSYSTEM);

		chassisSubsytemEClass = createEClass(CHASSIS_SUBSYTEM);
		createEReference(chassisSubsytemEClass, CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(automotiveDomainEClass, AutomotiveDomain.class, "AutomotiveDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridSUVEClass, HybridSUV.class, "HybridSUV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridSUV_PowerSubsystem(), this.getPowerSubSystem(), null, "powerSubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV_BreakSubsystem(), this.getBreakSubsystem(), null, "breakSubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV_BodySubsystem(), this.getBodySubsystem(), null, "bodySubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV_InteriorSubsystem(), this.getInteriorSubsystem(), null, "interiorSubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV_LightingSubsystem(), this.getLightingSubsystem(), null, "lightingSubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV_ChassisSubsystem(), this.getChassisSubsytem(), null, "chassisSubsystem", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(powerSubSystemEClass, PowerSubSystem.class, "PowerSubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSubSystem_WheelHubAssembly(), this.getWheelHubAssembly(), null, "wheelHubAssembly", null, 2, 2, PowerSubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPowerSubSystem_BrakePedal(), this.getBrakePedal(), null, "brakePedal", null, 1, 1, PowerSubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wheelHubAssemblyEClass, WheelHubAssembly.class, "WheelHubAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brakePedalEClass, BrakePedal.class, "BrakePedal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakSubsystemEClass, BreakSubsystem.class, "BreakSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakSubsystem_BrakePedal(), this.getBrakePedal(), null, "brakePedal", null, 1, 1, BreakSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bodySubsystemEClass, BodySubsystem.class, "BodySubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interiorSubsystemEClass, InteriorSubsystem.class, "InteriorSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightingSubsystemEClass, LightingSubsystem.class, "LightingSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chassisSubsytemEClass, ChassisSubsytem.class, "ChassisSubsytem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChassisSubsytem_WheelHubAssembly(), this.getWheelHubAssembly(), null, "wheelHubAssembly", null, 4, 4, ChassisSubsytem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HSUVStructurePackageImpl
