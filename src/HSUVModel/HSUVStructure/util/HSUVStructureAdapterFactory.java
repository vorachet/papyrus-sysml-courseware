/**
 */
package HSUVModel.HSUVStructure.util;

import HSUVModel.HSUVStructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVStructure.HSUVStructurePackage
 * @generated
 */
public class HSUVStructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HSUVStructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVStructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HSUVStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSUVStructureSwitch modelSwitch =
		new HSUVStructureSwitch() {
			public Object caseAutomotiveDomain(AutomotiveDomain object) {
				return createAutomotiveDomainAdapter();
			}
			public Object caseHybridSUV(HybridSUV object) {
				return createHybridSUVAdapter();
			}
			public Object casePowerSubSystem(PowerSubSystem object) {
				return createPowerSubSystemAdapter();
			}
			public Object caseWheelHubAssembly(WheelHubAssembly object) {
				return createWheelHubAssemblyAdapter();
			}
			public Object caseBrakePedal(BrakePedal object) {
				return createBrakePedalAdapter();
			}
			public Object caseBreakSubsystem(BreakSubsystem object) {
				return createBreakSubsystemAdapter();
			}
			public Object caseBodySubsystem(BodySubsystem object) {
				return createBodySubsystemAdapter();
			}
			public Object caseInteriorSubsystem(InteriorSubsystem object) {
				return createInteriorSubsystemAdapter();
			}
			public Object caseLightingSubsystem(LightingSubsystem object) {
				return createLightingSubsystemAdapter();
			}
			public Object caseChassisSubsytem(ChassisSubsytem object) {
				return createChassisSubsytemAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.AutomotiveDomain <em>Automotive Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.AutomotiveDomain
	 * @generated
	 */
	public Adapter createAutomotiveDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.HybridSUV <em>Hybrid SUV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.HybridSUV
	 * @generated
	 */
	public Adapter createHybridSUVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.PowerSubSystem <em>Power Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.PowerSubSystem
	 * @generated
	 */
	public Adapter createPowerSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.WheelHubAssembly <em>Wheel Hub Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.WheelHubAssembly
	 * @generated
	 */
	public Adapter createWheelHubAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.BrakePedal <em>Brake Pedal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.BrakePedal
	 * @generated
	 */
	public Adapter createBrakePedalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.BreakSubsystem <em>Break Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.BreakSubsystem
	 * @generated
	 */
	public Adapter createBreakSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.BodySubsystem <em>Body Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.BodySubsystem
	 * @generated
	 */
	public Adapter createBodySubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.InteriorSubsystem <em>Interior Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.InteriorSubsystem
	 * @generated
	 */
	public Adapter createInteriorSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.LightingSubsystem <em>Lighting Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.LightingSubsystem
	 * @generated
	 */
	public Adapter createLightingSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HSUVModel.HSUVStructure.ChassisSubsytem <em>Chassis Subsytem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HSUVModel.HSUVStructure.ChassisSubsytem
	 * @generated
	 */
	public Adapter createChassisSubsytemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HSUVStructureAdapterFactory
