/**
 */
package HSUVModel.HSUVStructure.impl;

import HSUVModel.HSUVStructure.BrakePedal;
import HSUVModel.HSUVStructure.BreakSubsystem;
import HSUVModel.HSUVStructure.HSUVStructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Break Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.HSUVStructure.impl.BreakSubsystemImpl#getBrakePedal <em>Brake Pedal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakSubsystemImpl extends MinimalEObjectImpl.Container implements BreakSubsystem {
	/**
	 * The cached value of the '{@link #getBrakePedal() <em>Brake Pedal</em>}' containment reference.
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
	protected BreakSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVStructurePackage.Literals.BREAK_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrakePedal getBrakePedal() {
		return brakePedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrakePedal(BrakePedal newBrakePedal, NotificationChain msgs) {
		BrakePedal oldBrakePedal = brakePedal;
		brakePedal = newBrakePedal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL, oldBrakePedal, newBrakePedal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrakePedal(BrakePedal newBrakePedal) {
		if (newBrakePedal != brakePedal) {
			NotificationChain msgs = null;
			if (brakePedal != null)
				msgs = ((InternalEObject)brakePedal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL, null, msgs);
			if (newBrakePedal != null)
				msgs = ((InternalEObject)newBrakePedal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL, null, msgs);
			msgs = basicSetBrakePedal(newBrakePedal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL, newBrakePedal, newBrakePedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL:
				return basicSetBrakePedal(null, msgs);
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
			case HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL:
				return getBrakePedal();
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
			case HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL:
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
			case HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL:
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
			case HSUVStructurePackage.BREAK_SUBSYSTEM__BRAKE_PEDAL:
				return brakePedal != null;
		}
		return super.eIsSet(featureID);
	}

} //BreakSubsystemImpl
