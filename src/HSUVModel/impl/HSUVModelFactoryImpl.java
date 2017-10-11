/**
 */
package HSUVModel.impl;

import HSUVModel.*;

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
public class HSUVModelFactoryImpl extends EFactoryImpl implements HSUVModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HSUVModelFactory init() {
		try {
			HSUVModelFactory theHSUVModelFactory = (HSUVModelFactory)EPackage.Registry.INSTANCE.getEFactory(HSUVModelPackage.eNS_URI);
			if (theHSUVModelFactory != null) {
				return theHSUVModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HSUVModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HSUVModelPackage.HYBRID_SUV: return createHybridSUV();
			case HSUVModelPackage.POWER_SUB_SYSTEM: return createPowerSubSystem();
			case HSUVModelPackage.WHEEL_HUB_ASSEMBLY: return createWheelHubAssembly();
			case HSUVModelPackage.BRAKE_PEDAL: return createBrakePedal();
			case HSUVModelPackage.BREAK_SUBSYSTEM: return createBreakSubsystem();
			case HSUVModelPackage.BODY_SUBSYSTEM: return createBodySubsystem();
			case HSUVModelPackage.INTERIOR_SUBSYSTEM: return createInteriorSubsystem();
			case HSUVModelPackage.LIGHTING_SUBSYSTEM: return createLightingSubsystem();
			case HSUVModelPackage.CHASSIS_SUBSYTEM: return createChassisSubsytem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public HSUVModelPackage getHSUVModelPackage() {
		return (HSUVModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HSUVModelPackage getPackage() {
		return HSUVModelPackage.eINSTANCE;
	}

} //HSUVModelFactoryImpl
