/**
 */
package HSUVModel.HSUVRequirements.impl;

import HSUVModel.HSUVRequirements.*;

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
public class HSUVRequirementsFactoryImpl extends EFactoryImpl implements HSUVRequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HSUVRequirementsFactory init() {
		try {
			HSUVRequirementsFactory theHSUVRequirementsFactory = (HSUVRequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(HSUVRequirementsPackage.eNS_URI);
			if (theHSUVRequirementsFactory != null) {
				return theHSUVRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HSUVRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVRequirementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HSUVRequirementsPackage.PERFORMANCE: return createPerformance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSUVRequirementsPackage getHSUVRequirementsPackage() {
		return (HSUVRequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HSUVRequirementsPackage getPackage() {
		return HSUVRequirementsPackage.eINSTANCE;
	}

} //HSUVRequirementsFactoryImpl
