/**
 */
package HSUVModel.HSUVViews;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see HSUVModel.HSUVViews.HSUVViewsFactory
 * @model kind="package"
 * @generated
 */
public interface HSUVViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HSUVViews";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///HSUVModel/HSUVViews.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HSUVModel.HSUVViews";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HSUVViewsPackage eINSTANCE = HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVViews.impl.OperationalVIewpointImpl <em>Operational VIewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVViews.impl.OperationalVIewpointImpl
	 * @see HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl#getOperationalVIewpoint()
	 * @generated
	 */
	int OPERATIONAL_VIEWPOINT = 0;

	/**
	 * The number of structural features of the '<em>Operational VIewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_VIEWPOINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link HSUVModel.HSUVViews.impl.PerformanceViewpointImpl <em>Performance Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HSUVModel.HSUVViews.impl.PerformanceViewpointImpl
	 * @see HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl#getPerformanceViewpoint()
	 * @generated
	 */
	int PERFORMANCE_VIEWPOINT = 1;

	/**
	 * The number of structural features of the '<em>Performance Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_VIEWPOINT_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVViews.OperationalVIewpoint <em>Operational VIewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational VIewpoint</em>'.
	 * @see HSUVModel.HSUVViews.OperationalVIewpoint
	 * @generated
	 */
	EClass getOperationalVIewpoint();

	/**
	 * Returns the meta object for class '{@link HSUVModel.HSUVViews.PerformanceViewpoint <em>Performance Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Viewpoint</em>'.
	 * @see HSUVModel.HSUVViews.PerformanceViewpoint
	 * @generated
	 */
	EClass getPerformanceViewpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HSUVViewsFactory getHSUVViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVViews.impl.OperationalVIewpointImpl <em>Operational VIewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVViews.impl.OperationalVIewpointImpl
		 * @see HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl#getOperationalVIewpoint()
		 * @generated
		 */
		EClass OPERATIONAL_VIEWPOINT = eINSTANCE.getOperationalVIewpoint();

		/**
		 * The meta object literal for the '{@link HSUVModel.HSUVViews.impl.PerformanceViewpointImpl <em>Performance Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HSUVModel.HSUVViews.impl.PerformanceViewpointImpl
		 * @see HSUVModel.HSUVViews.impl.HSUVViewsPackageImpl#getPerformanceViewpoint()
		 * @generated
		 */
		EClass PERFORMANCE_VIEWPOINT = eINSTANCE.getPerformanceViewpoint();

	}

} //HSUVViewsPackage
