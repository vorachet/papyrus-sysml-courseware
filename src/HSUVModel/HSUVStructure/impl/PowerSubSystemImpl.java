/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVStructure.BrakePedal;
import HSUVModel.HSUVStructure.HSUVStructurePackage;
import HSUVModel.HSUVStructure.PowerSubSystem;
import HSUVModel.HSUVStructure.WheelHubAssembly;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HSUVStructure.impl.PowerSubSystemImpl#getWheelHubAssembly <em>Wheel Hub Assembly</em>}</li>
 *   <li>{@link HSUVModel.HSUVStructure.impl.PowerSubSystemImpl#getBrakePedal <em>Brake Pedal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSubSystemImpl extends MinimalEObjectImpl.Container implements PowerSubSystem {
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
	 * The cached value of the '{@link #getBrakePedal() <em>Brake Pedal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrakePedal()
	 * @generated
	 * @ordered
	 */
	protected BrakePedal brakePedal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSubSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVStructurePackage.Literals.POWER_SUB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWheelHubAssembly() {
		if (wheelHubAssembly == null) {
			wheelHubAssembly = new EObjectContainmentEList(WheelHubAssembly.class, this, HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY);
		}
		return wheelHubAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrakePedal getBrakePedal() {
		if (brakePedal != null && brakePedal.eIsProxy()) {
			InternalEObject oldBrakePedal = (InternalEObject)brakePedal;
			brakePedal = (BrakePedal)eResolveProxy(oldBrakePedal);
			if (brakePedal != oldBrakePedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL, oldBrakePedal, brakePedal));
			}
		}
		return brakePedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrakePedal basicGetBrakePedal() {
		return brakePedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrakePedal(BrakePedal newBrakePedal) {
		BrakePedal oldBrakePedal = brakePedal;
		brakePedal = newBrakePedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL, oldBrakePedal, brakePedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY:
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
			case HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY:
				return getWheelHubAssembly();
			case HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL:
				if (resolve) return getBrakePedal();
				return basicGetBrakePedal();
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
			case HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY:
				getWheelHubAssembly().clear();
				getWheelHubAssembly().addAll((Collection)newValue);
				return;
			case HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL:
				setBrakePedal((BrakePedal)newValue);
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
			case HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY:
				getWheelHubAssembly().clear();
				return;
			case HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL:
				setBrakePedal((BrakePedal)null);
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
			case HSUVStructurePackage.POWER_SUB_SYSTEM__WHEEL_HUB_ASSEMBLY:
				return wheelHubAssembly != null && !wheelHubAssembly.isEmpty();
			case HSUVStructurePackage.POWER_SUB_SYSTEM__BRAKE_PEDAL:
				return brakePedal != null;
		}
		return super.eIsSet(featureID);
	}

} //PowerSubSystemImpl
