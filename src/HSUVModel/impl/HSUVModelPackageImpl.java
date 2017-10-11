/**
 */
package HSUVModel.impl;

import HSUVModel.BodySubsystem;
import HSUVModel.BrakePedal;
import HSUVModel.BreakSubsystem;
import HSUVModel.ChassisSubsytem;
import HSUVModel.HSUVModelFactory;
import HSUVModel.HSUVModelPackage;

import HSUVModel.HSUVRequirements.HSUVRequirementsPackage;

import HSUVModel.HSUVRequirements.impl.HSUVRequirementsPackageImpl;

import HSUVModel.HSUVStructure.HSUVStructurePackage;

import HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl;

import HSUVModel.HSUVViews.HSUVViewsPackage;

import HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl;

import HSUVModel.HybridSUV;
import HSUVModel.InteriorSubsystem;
import HSUVModel.LightingSubsystem;
import HSUVModel.PowerSubSystem;
import HSUVModel.WheelHubAssembly;

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
public class HSUVModelPackageImpl extends EPackageImpl implements HSUVModelPackage {
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
	 * @see HSUVModel.HSUVModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HSUVModelPackageImpl() {
		super(eNS_URI, HSUVModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HSUVModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HSUVModelPackage init() {
		if (isInited) return (HSUVModelPackage)EPackage.Registry.INSTANCE.getEPackage(HSUVModelPackage.eNS_URI);

		// Obtain or create and register package
		HSUVModelPackageImpl theHSUVModelPackage = (HSUVModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HSUVModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HSUVModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HSUVStructurePackageImpl theHSUVStructurePackage = (HSUVStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI) instanceof HSUVStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI) : HSUVStructurePackage.eINSTANCE);
		HSUVViewsPackageImpl theHSUVViewsPackage = (HSUVViewsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI) instanceof HSUVViewsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI) : HSUVViewsPackage.eINSTANCE);
		HSUVRequirementsPackageImpl theHSUVRequirementsPackage = (HSUVRequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) instanceof HSUVRequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) : HSUVRequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theHSUVModelPackage.createPackageContents();
		theHSUVStructurePackage.createPackageContents();
		theHSUVViewsPackage.createPackageContents();
		theHSUVRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theHSUVModelPackage.initializePackageContents();
		theHSUVStructurePackage.initializePackageContents();
		theHSUVViewsPackage.initializePackageContents();
		theHSUVRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHSUVModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HSUVModelPackage.eNS_URI, theHSUVModelPackage);
		return theHSUVModelPackage;
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
	public EReference getHybridSUV_P() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridSUV__() {
		return (EReference)hybridSUVEClass.getEStructuralFeatures().get(1);
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
	public EReference getPowerSubSystem__() {
		return (EReference)powerSubSystemEClass.getEStructuralFeatures().get(0);
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
	public EReference getBreakSubsystem__() {
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
	public EReference getChassisSubsytem__() {
		return (EReference)chassisSubsytemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVModelFactory getHSUVModelFactory() {
		return (HSUVModelFactory)getEFactoryInstance();
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
		hybridSUVEClass = createEClass(HYBRID_SUV);
		createEReference(hybridSUVEClass, HYBRID_SUV__P);
		createEReference(hybridSUVEClass, HYBRID_SUV__);

		powerSubSystemEClass = createEClass(POWER_SUB_SYSTEM);
		createEReference(powerSubSystemEClass, POWER_SUB_SYSTEM__);

		wheelHubAssemblyEClass = createEClass(WHEEL_HUB_ASSEMBLY);

		brakePedalEClass = createEClass(BRAKE_PEDAL);

		breakSubsystemEClass = createEClass(BREAK_SUBSYSTEM);
		createEReference(breakSubsystemEClass, BREAK_SUBSYSTEM__);

		bodySubsystemEClass = createEClass(BODY_SUBSYSTEM);

		interiorSubsystemEClass = createEClass(INTERIOR_SUBSYSTEM);

		lightingSubsystemEClass = createEClass(LIGHTING_SUBSYSTEM);

		chassisSubsytemEClass = createEClass(CHASSIS_SUBSYTEM);
		createEReference(chassisSubsytemEClass, CHASSIS_SUBSYTEM__);
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

		// Obtain other dependent packages
		HSUVStructurePackage theHSUVStructurePackage = (HSUVStructurePackage)EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI);
		HSUVViewsPackage theHSUVViewsPackage = (HSUVViewsPackage)EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI);
		HSUVRequirementsPackage theHSUVRequirementsPackage = (HSUVRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theHSUVStructurePackage);
		getESubpackages().add(theHSUVViewsPackage);
		getESubpackages().add(theHSUVRequirementsPackage);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(hybridSUVEClass, HybridSUV.class, "HybridSUV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridSUV_P(), this.getPowerSubSystem(), null, "p", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHybridSUV__(), this.getBreakSubsystem(), null, "_", null, 1, 1, HybridSUV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(powerSubSystemEClass, PowerSubSystem.class, "PowerSubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSubSystem__(), this.getWheelHubAssembly(), null, "_", null, 2, 2, PowerSubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wheelHubAssemblyEClass, WheelHubAssembly.class, "WheelHubAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brakePedalEClass, BrakePedal.class, "BrakePedal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakSubsystemEClass, BreakSubsystem.class, "BreakSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakSubsystem__(), this.getBrakePedal(), null, "_", null, 1, 1, BreakSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bodySubsystemEClass, BodySubsystem.class, "BodySubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interiorSubsystemEClass, InteriorSubsystem.class, "InteriorSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightingSubsystemEClass, LightingSubsystem.class, "LightingSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chassisSubsytemEClass, ChassisSubsytem.class, "ChassisSubsytem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChassisSubsytem__(), this.getWheelHubAssembly(), null, "_", null, 4, 4, ChassisSubsytem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HSUVModelPackageImpl
