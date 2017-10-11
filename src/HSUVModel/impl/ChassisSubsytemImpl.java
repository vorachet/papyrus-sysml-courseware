/**
 */
package HSUVModel.impl;

import HSUVModel.ChassisSubsytem;
import HSUVModel.HSUVModelPackage;
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
 * An implementation of the model object '<em><b>Chassis Subsytem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.impl.ChassisSubsytemImpl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChassisSubsytemImpl extends MinimalEObjectImpl.Container implements ChassisSubsytem {
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
	protected ChassisSubsytemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVModelPackage.Literals.CHASSIS_SUBSYTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList get_() {
		if (_ == null) {
			_ = new EObjectContainmentEList(WheelHubAssembly.class, this, HSUVModelPackage.CHASSIS_SUBSYTEM__);
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
			case HSUVModelPackage.CHASSIS_SUBSYTEM__:
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
			case HSUVModelPackage.CHASSIS_SUBSYTEM__:
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
			case HSUVModelPackage.CHASSIS_SUBSYTEM__:
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
			case HSUVModelPackage.CHASSIS_SUBSYTEM__:
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
			case HSUVModelPackage.CHASSIS_SUBSYTEM__:
				return _ != null && !_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChassisSubsytemImpl
