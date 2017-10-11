/**
 */
package HSUVModel.HSUVStructure.util;

import HSUVModel.HSUVStructure.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVStructure.HSUVStructurePackage
 * @generated
 */
public class HSUVStructureSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HSUVStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = HSUVStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HSUVStructurePackage.AUTOMOTIVE_DOMAIN: {
				AutomotiveDomain automotiveDomain = (AutomotiveDomain)theEObject;
				Object result = caseAutomotiveDomain(automotiveDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.HYBRID_SUV: {
				HybridSUV hybridSUV = (HybridSUV)theEObject;
				Object result = caseHybridSUV(hybridSUV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.POWER_SUB_SYSTEM: {
				PowerSubSystem powerSubSystem = (PowerSubSystem)theEObject;
				Object result = casePowerSubSystem(powerSubSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.WHEEL_HUB_ASSEMBLY: {
				WheelHubAssembly wheelHubAssembly = (WheelHubAssembly)theEObject;
				Object result = caseWheelHubAssembly(wheelHubAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.BRAKE_PEDAL: {
				BrakePedal brakePedal = (BrakePedal)theEObject;
				Object result = caseBrakePedal(brakePedal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.BREAK_SUBSYSTEM: {
				BreakSubsystem breakSubsystem = (BreakSubsystem)theEObject;
				Object result = caseBreakSubsystem(breakSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.BODY_SUBSYSTEM: {
				BodySubsystem bodySubsystem = (BodySubsystem)theEObject;
				Object result = caseBodySubsystem(bodySubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.INTERIOR_SUBSYSTEM: {
				InteriorSubsystem interiorSubsystem = (InteriorSubsystem)theEObject;
				Object result = caseInteriorSubsystem(interiorSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.LIGHTING_SUBSYSTEM: {
				LightingSubsystem lightingSubsystem = (LightingSubsystem)theEObject;
				Object result = caseLightingSubsystem(lightingSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HSUVStructurePackage.CHASSIS_SUBSYTEM: {
				ChassisSubsytem chassisSubsytem = (ChassisSubsytem)theEObject;
				Object result = caseChassisSubsytem(chassisSubsytem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automotive Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automotive Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAutomotiveDomain(AutomotiveDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid SUV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid SUV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHybridSUV(HybridSUV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePowerSubSystem(PowerSubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheel Hub Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheel Hub Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWheelHubAssembly(WheelHubAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brake Pedal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brake Pedal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBrakePedal(BrakePedal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBreakSubsystem(BreakSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBodySubsystem(BodySubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInteriorSubsystem(InteriorSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lighting Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lighting Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLightingSubsystem(LightingSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chassis Subsytem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chassis Subsytem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChassisSubsytem(ChassisSubsytem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //HSUVStructureSwitch
