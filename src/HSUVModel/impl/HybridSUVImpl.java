/**
 */
package HSUVModel.impl;

import HSUVModel.BreakSubsystem;
import HSUVModel.HSUVModelPackage;
import HSUVModel.HybridSUV;
import HSUVModel.PowerSubSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid SUV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HSUVModel.impl.HybridSUVImpl#getP <em>P</em>}</li>
 *   <li>{@link HSUVModel.impl.HybridSUVImpl#get_ <em></em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridSUVImpl extends MinimalEObjectImpl.Container implements HybridSUV {
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected PowerSubSystem p;

	/**
	 * The cached value of the '{@link #get_() <em></em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_()
	 * @generated
	 * @ordered
	 */
	protected BreakSubsystem _;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridSUVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HSUVModelPackage.Literals.HYBRID_SUV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSubSystem getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PowerSubSystem newP, NotificationChain msgs) {
		PowerSubSystem oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVModelPackage.HYBRID_SUV__P, oldP, newP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(PowerSubSystem newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.HYBRID_SUV__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.HYBRID_SUV__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVModelPackage.HYBRID_SUV__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakSubsystem get_() {
		return _;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_(BreakSubsystem new_, NotificationChain msgs) {
		BreakSubsystem old_ = _;
		_ = new_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HSUVModelPackage.HYBRID_SUV__, old_, new_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_(BreakSubsystem new_) {
		if (new_ != _) {
			NotificationChain msgs = null;
			if (_ != null)
				msgs = ((InternalEObject)_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.HYBRID_SUV__, null, msgs);
			if (new_ != null)
				msgs = ((InternalEObject)new_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HSUVModelPackage.HYBRID_SUV__, null, msgs);
			msgs = basicSet_(new_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HSUVModelPackage.HYBRID_SUV__, new_, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HSUVModelPackage.HYBRID_SUV__P:
				return basicSetP(null, msgs);
			case HSUVModelPackage.HYBRID_SUV__:
				return basicSet_(null, msgs);
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
			case HSUVModelPackage.HYBRID_SUV__P:
				return getP();
			case HSUVModelPackage.HYBRID_SUV__:
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
			case HSUVModelPackage.HYBRID_SUV__P:
				setP((PowerSubSystem)newValue);
				return;
			case HSUVModelPackage.HYBRID_SUV__:
				set_((BreakSubsystem)newValue);
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
			case HSUVModelPackage.HYBRID_SUV__P:
				setP((PowerSubSystem)null);
				return;
			case HSUVModelPackage.HYBRID_SUV__:
				set_((BreakSubsystem)null);
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
			case HSUVModelPackage.HYBRID_SUV__P:
				return p != null;
			case HSUVModelPackage.HYBRID_SUV__:
				return _ != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridSUVImpl
