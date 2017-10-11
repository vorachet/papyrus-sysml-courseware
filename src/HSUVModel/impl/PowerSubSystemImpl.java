/**
 */
package HSUVModel.impl;

import HSUVModel.HSUVModelPackage;
import HSUVModel.PowerSubSystem;
import HSUVModel.WheelHubAssembly;

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
 * An implementation of the model object '<em><b>Power Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.impl.PowerSubSystemImpl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSubSystemImpl extends MinimalEObjectImpl.Container implements PowerSubSystem {
	/**
	 * The cached value of the '{@link #get_() <em></em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_()
	 * @generated
	 * @ordered
	 */
	protected EList _;

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
		return HSUVModelPackage.Literals.POWER_SUB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList get_() {
		if (_ == null) {
			_ = new EObjectContainmentEList(WheelHubAssembly.class, this, HSUVModelPackage.POWER_SUB_SYSTEM__);
		}
		return _;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVModelPackage.POWER_SUB_SYSTEM__:
				return ((InternalEList)get_()).basicRemove(otherEnd, msgs);
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
			case HSUVModelPackage.POWER_SUB_SYSTEM__:
				return get_();
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
			case HSUVModelPackage.POWER_SUB_SYSTEM__:
				get_().clear();
				get_().addAll((Collection)newValue);
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
			case HSUVModelPackage.POWER_SUB_SYSTEM__:
				get_().clear();
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
			case HSUVModelPackage.POWER_SUB_SYSTEM__:
				return _ != null && !_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerSubSystemImpl
