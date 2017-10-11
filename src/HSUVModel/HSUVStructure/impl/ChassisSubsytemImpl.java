/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVStructure.ChassisSubsytem;
import HSUVModel.HSUVStructure.HSUVStructurePackage;
import HSUVModel.HSUVStructure.WheelHubAssembly;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chassis Subsytem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HSUVStructure.impl.ChassisSubsytemImpl#getWheelHubAssembly <em>Wheel Hub Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChassisSubsytemImpl extends MinimalEObjectImpl.Container implements ChassisSubsytem {
	/**
	 * The cached value of the '{@link #getWheelHubAssembly() <em>Wheel Hub Assembly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelHubAssembly()
	 * @generated
	 * @ordered
	 */
	protected EList wheelHubAssembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChassisSubsytemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVStructurePackage.Literals.CHASSIS_SUBSYTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWheelHubAssembly() {
		if (wheelHubAssembly == null) {
			wheelHubAssembly = new EObjectContainmentEList(WheelHubAssembly.class, this, HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY);
		}
		return wheelHubAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY:
				return ((InternalEList)getWheelHubAssembly()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY:
				return getWheelHubAssembly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY:
				getWheelHubAssembly().clear();
				getWheelHubAssembly().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY:
				getWheelHubAssembly().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HSUVStructurePackage.CHASSIS_SUBSYTEM__WHEEL_HUB_ASSEMBLY:
				return wheelHubAssembly != null && !wheelHubAssembly.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChassisSubsytemImpl
