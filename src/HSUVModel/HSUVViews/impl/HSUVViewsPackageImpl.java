/**
 */
package HSUVModel.HSUVViews.impl;

import HSUVModel.HSUVRequirements.HSUVRequirementsPackage;

import HSUVModel.HSUVRequirements.impl.HSUVRequirementsPackageImpl;

import HSUVModel.HSUVStructure.HSUVStructurePackage;

import HSUVModel.HSUVStructure.impl.HSUVStructurePackageImpl;

import HSUVModel.HSUVViews.HSUVViewsFactory;
import HSUVModel.HSUVViews.HSUVViewsPackage;
import HSUVModel.HSUVViews.OperationalVIewpoint;
import HSUVModel.HSUVViews.PerformanceViewpoint;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HSUVViewsPackageImpl extends EPackageImpl implements HSUVViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalVIewpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceViewpointEClass = null;

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
	 * @see HSUVModel.HSUVViews.HSUVViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HSUVViewsPackageImpl() {
		super(eNS_URI, HSUVViewsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HSUVViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HSUVViewsPackage init() {
		if (isInited) return (HSUVViewsPackage)EPackage.Registry.INSTANCE.getEPackage(HSUVViewsPackage.eNS_URI);

		// Obtain or create and register package
		HSUVViewsPackageImpl theHSUVViewsPackage = (HSUVViewsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HSUVViewsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HSUVViewsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HSUVStructurePackageImpl theHSUVStructurePackage = (HSUVStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI) instanceof HSUVStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVStructurePackage.eNS_URI) : HSUVStructurePackage.eINSTANCE);
		HSUVRequirementsPackageImpl theHSUVRequirementsPackage = (HSUVRequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) instanceof HSUVRequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HSUVRequirementsPackage.eNS_URI) : HSUVRequirementsPackage.eINSTANCE);

		// Create package meta-data objects
		theHSUVViewsPackage.createPackageContents();
		theHSUVStructurePackage.createPackageContents();
		theHSUVRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theHSUVViewsPackage.initializePackageContents();
		theHSUVStructurePackage.initializePackageContents();
		theHSUVRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHSUVViewsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HSUVViewsPackage.eNS_URI, theHSUVViewsPackage);
		return theHSUVViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalVIewpoint() {
		return operationalVIewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceViewpoint() {
		return performanceViewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVViewsFactory getHSUVViewsFactory() {
		return (HSUVViewsFactory)getEFactoryInstance();
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
		operationalVIewpointEClass = createEClass(OPERATIONAL_VIEWPOINT);

		performanceViewpointEClass = createEClass(PERFORMANCE_VIEWPOINT);
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
		initEClass(operationalVIewpointEClass, OperationalVIewpoint.class, "OperationalVIewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performanceViewpointEClass, PerformanceViewpoint.class, "PerformanceViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HSUVViewsPackageImpl
