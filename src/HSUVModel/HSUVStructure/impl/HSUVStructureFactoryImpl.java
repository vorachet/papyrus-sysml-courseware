/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVStructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HSUVStructureFactoryImpl extends EFactoryImpl implements HSUVStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HSUVStructureFactory init() {
		try {
			HSUVStructureFactory theHSUVStructureFactory = (HSUVStructureFactory)EPackage.Registry.INSTANCE.getEFactory(HSUVStructurePackage.eNS_URI);
			if (theHSUVStructureFactory != null) {
				return theHSUVStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HSUVStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVStructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HSUVStructurePackage.AUTOMOTIVE_DOMAIN: return createAutomotiveDomain();
			case HSUVStructurePackage.HYBRID_SUV: return createHybridSUV();
			case HSUVStructurePackage.POWER_SUB_SYSTEM: return createPowerSubSystem();
			case HSUVStructurePackage.WHEEL_HUB_ASSEMBLY: return createWheelHubAssembly();
			case HSUVStructurePackage.BRAKE_PEDAL: return createBrakePedal();
			case HSUVStructurePackage.BREAK_SUBSYSTEM: return createBreakSubsystem();
			case HSUVStructurePackage.BODY_SUBSYSTEM: return createBodySubsystem();
			case HSUVStructurePackage.INTERIOR_SUBSYSTEM: return createInteriorSubsystem();
			case HSUVStructurePackage.LIGHTING_SUBSYSTEM: return createLightingSubsystem();
			case HSUVStructurePackage.CHASSIS_SUBSYTEM: return createChassisSubsytem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomotiveDomain createAutomotiveDomain() {
		AutomotiveDomainImpl automotiveDomain = new AutomotiveDomainImpl();
		return automotiveDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridSUV createHybridSUV() {
		HybridSUVImpl hybridSUV = new HybridSUVImpl();
		return hybridSUV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSubSystem createPowerSubSystem() {
		PowerSubSystemImpl powerSubSystem = new PowerSubSystemImpl();
		return powerSubSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelHubAssembly createWheelHubAssembly() {
		WheelHubAssemblyImpl wheelHubAssembly = new WheelHubAssemblyImpl();
		return wheelHubAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrakePedal createBrakePedal() {
		BrakePedalImpl brakePedal = new BrakePedalImpl();
		return brakePedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakSubsystem createBreakSubsystem() {
		BreakSubsystemImpl breakSubsystem = new BreakSubsystemImpl();
		return breakSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySubsystem createBodySubsystem() {
		BodySubsystemImpl bodySubsystem = new BodySubsystemImpl();
		return bodySubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorSubsystem createInteriorSubsystem() {
		InteriorSubsystemImpl interiorSubsystem = new InteriorSubsystemImpl();
		return interiorSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightingSubsystem createLightingSubsystem() {
		LightingSubsystemImpl lightingSubsystem = new LightingSubsystemImpl();
		return lightingSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChassisSubsytem createChassisSubsytem() {
		ChassisSubsytemImpl chassisSubsytem = new ChassisSubsytemImpl();
		return chassisSubsytem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVStructurePackage getHSUVStructurePackage() {
		return (HSUVStructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HSUVStructurePackage getPackage() {
		return HSUVStructurePackage.eINSTANCE;
	}

} //HSUVStructureFactoryImpl
