(defproject rn-commonjs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [org.clojure/clojurescript "0.0-3321"]
                 [org.omcljs/ambly "0.5.0"]]
  :plugins [[lein-cljsbuild "1.0.6"]]
  :source-paths ["src"]
  :clean-targets ["target" "out"]
  :cljsbuild
  {:builds
   [{:source-paths ["src"]
     :compiler
                   {:output-to  "out/main.js"
                    :output-dir "out"
                    :foreign-libs
                                [{:file
                                               "Libraries/ActionSheetIOS/ActionSheetIOS.js",
                                  :provides    ["ActionSheetIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AdSupport/AdSupportIOS.js",
                                  :provides    ["AdSupportIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/AnimationExperimental.js",
                                  :provides    ["AnimationExperimental"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/AnimationUtils.js",
                                  :provides    ["AnimationUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/LayoutAnimation.js",
                                  :provides    ["LayoutAnimation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/POPAnimationMixin.js",
                                  :provides    ["POPAnimationMixin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppRegistry/AppRegistry.js",
                                  :provides    ["AppRegistry"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppStateIOS/AppStateIOS.android.js",
                                  :provides    ["AppStateIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppStateIOS/AppStateIOS.ios.js",
                                  :provides    ["AppStateIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ART/ARTSerializablePath.js",
                                  :provides    ["ARTSerializablePath"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ART/ReactNativeART.js",
                                  :provides    ["ReactNativeART"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/__mocks__/NativeModules.js",
                                  :provides    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/NativeModules.js",
                                  :provides    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/POPAnimation.js",
                                  :provides    ["POPAnimation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTAlertManager.ios.js",
                                  :provides    ["RCTAlertManager.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTEventEmitter.js",
                                  :provides    ["RCTEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTJSTimers.js",
                                  :provides    ["RCTJSTimers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchingImplementation/BatchedBridge.js",
                                  :provides    ["BatchedBridge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchingImplementation/BatchedBridgeFactory.js",
                                  :provides    ["BatchedBridgeFactory"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CameraRoll/CameraRoll.js",
                                  :provides    ["CameraRoll"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ActivityIndicatorIOS/ActivityIndicatorIOS.ios.js",
                                  :provides    ["ActivityIndicatorIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/DatePicker/DatePickerIOS.ios.js",
                                  :provides    ["DatePickerIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/MapView/MapView.js",
                                  :provides    ["MapView"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Navigation/NavigatorIOS.ios.js",
                                  :provides    ["NavigatorIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ProgressViewIOS/ProgressViewIOS.android.js",
                                  :provides    ["ProgressViewIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ProgressViewIOS/ProgressViewIOS.ios.js",
                                  :provides    ["ProgressViewIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ScrollResponder.js",
                                  :provides    ["ScrollResponder"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ScrollView/ScrollView.js",
                                  :provides    ["ScrollView"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SegmentedControlIOS/SegmentedControlIOS.android.js",
                                  :provides    ["SegmentedControlIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SegmentedControlIOS/SegmentedControlIOS.ios.js",
                                  :provides    ["SegmentedControlIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SliderIOS/SliderIOS.js",
                                  :provides    ["SliderIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/StaticRenderer.js",
                                  :provides    ["StaticRenderer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/StatusBar/StatusBarIOS.ios.js",
                                  :provides    ["StatusBarIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Subscribable.js",
                                  :provides    ["Subscribable"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SwitchIOS/SwitchIOS.android.js",
                                  :provides    ["SwitchIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SwitchIOS/SwitchIOS.ios.js",
                                  :provides    ["SwitchIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarIOS.android.js",
                                  :provides    ["TabBarIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarIOS.ios.js",
                                  :provides    ["TabBarIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarItemIOS.android.js",
                                  :provides    ["TabBarItemIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarItemIOS.ios.js",
                                  :provides    ["TabBarItemIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TextInput/TextInput.js",
                                  :provides    ["TextInput"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TextInput/TextInputState.js",
                                  :provides    ["TextInputState"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/ensureComponentIsNative.js",
                                  :provides    ["ensureComponentIsNative"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/ensurePositiveDelayProps.js",
                                  :provides    ["ensurePositiveDelayProps"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableBounce.js",
                                  :provides    ["TouchableBounce"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableHighlight.js",
                                  :provides    ["TouchableHighlight"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableOpacity.js",
                                  :provides    ["TouchableOpacity"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableWithoutFeedback.js",
                                  :provides    ["TouchableWithoutFeedback"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/UnimplementedViews/UnimplementedView.js",
                                  :provides    ["UnimplementedView"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/View/View.js",
                                  :provides    ["View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/View/ViewStylePropTypes.js",
                                  :provides    ["ViewStylePropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/WebView/WebView.android.js",
                                  :provides    ["WebView.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/WebView/WebView.ios.js",
                                  :provides    ["WebView.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/ListView/ListView.js",
                                  :provides    ["ListView"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/ListView/ListViewDataSource.js",
                                  :provides    ["ListViewDataSource"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/Navigator.js",
                                  :provides    ["Navigator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorBreadcrumbNavigationBar.js",
                                  :provides    ["NavigatorBreadcrumbNavigationBar"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorBreadcrumbNavigationBarStyles.ios.js",
                                  :provides    ["NavigatorBreadcrumbNavigationBarStyles.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorNavigationBar.js",
                                  :provides    ["NavigatorNavigationBar"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorNavigationBarStyles.ios.js",
                                  :provides    ["NavigatorNavigationBarStyles.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorSceneConfigs.js",
                                  :provides    ["NavigatorSceneConfigs"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Device/RCTDeviceEventEmitter.js",
                                  :provides    ["RCTDeviceEventEmitter"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Fetch/fetch.js",
                                  :provides    ["fetch"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Geolocation/Geolocation.js",
                                  :provides    ["Geolocation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/__tests__/resolveAssetSource-test.js",
                                  :provides    ["resolveAssetSource-test"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/AssetRegistry.js",
                                  :provides    ["AssetRegistry"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/Image.ios.js",
                                  :provides    ["Image.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageResizeMode.js",
                                  :provides    ["ImageResizeMode"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageSource.js",
                                  :provides    ["ImageSource"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageStylePropTypes.js",
                                  :provides    ["ImageStylePropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/resolveAssetSource.js",
                                  :provides    ["resolveAssetSource"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/BorderBox.js",
                                  :provides    ["BorderBox"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/BoxInspector.js",
                                  :provides    ["BoxInspector"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/ElementBox.js",
                                  :provides    ["ElementBox"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/ElementProperties.js",
                                  :provides    ["ElementProperties"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/Inspector.js",
                                  :provides    ["Inspector"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorOverlay.js",
                                  :provides    ["InspectorOverlay"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorPanel.js",
                                  :provides    ["InspectorPanel"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorUtils.js",
                                  :provides    ["InspectorUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/resolveBoxStyle.js",
                                  :provides    ["resolveBoxStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/StyleInspector.js",
                                  :provides    ["StyleInspector"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Interaction/InteractionManager.js",
                                  :provides    ["InteractionManager"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Interaction/InteractionMixin.js",
                                  :provides    ["InteractionMixin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/ExceptionsManager.js",
                                  :provides    ["ExceptionsManager"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/InitializeJavaScriptAppEngine.js",
                                  :provides    ["InitializeJavaScriptAppEngine"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/loadSourceMap.js",
                                  :provides    ["loadSourceMap"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/parseErrorStack.js",
                                  :provides    ["parseErrorStack"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/source-map-url.js",
                                  :provides    ["source-map-url"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/SourceMap.js",
                                  :provides    ["SourceMap"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/polyfills/document.js",
                                  :provides    ["document"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/System/JSTimers/JSTimers.js",
                                  :provides    ["JSTimers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/System/JSTimers/JSTimersExecution.js",
                                  :provides    ["JSTimersExecution"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/LinkingIOS/LinkingIOS.js",
                                  :provides    ["LinkingIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/NativeApp/RCTNativeAppEventEmitter.js",
                                  :provides    ["RCTNativeAppEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/FormData.js",
                                  :provides    ["FormData"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/NetInfo.js",
                                  :provides    ["NetInfo"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/XMLHttpRequest.ios.js",
                                  :provides    ["XMLHttpRequest.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/XMLHttpRequestBase.js",
                                  :provides    ["XMLHttpRequestBase"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Picker/PickerIOS.android.js",
                                  :provides    ["PickerIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Picker/PickerIOS.ios.js",
                                  :provides    ["PickerIOS.ios"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Promise.js",
                                  :provides    ["Promise"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/PushNotificationIOS/PushNotificationIOS.js",
                                  :provides    ["PushNotificationIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/react-native/react-native-interface.js",
                                  :provides    ["react-native-interface"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/react-native/react-native.js",
                                  :provides    ["react-native"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/diffRawProperties.js",
                                  :provides    ["diffRawProperties"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/IOSDefaultEventPluginOrder.js",
                                  :provides    ["IOSDefaultEventPluginOrder"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/IOSNativeBridgeEventPlugin.js",
                                  :provides    ["IOSNativeBridgeEventPlugin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/NativeMethodsMixin.js",
                                  :provides    ["NativeMethodsMixin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/renderApplication.ios.js",
                                  :provides    ["renderApplication.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/requireNativeComponent.js",
                                  :provides    ["requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/verifyPropTypes.js",
                                  :provides    ["verifyPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/WarningBox.js",
                                  :provides    ["WarningBox"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/createReactNativeComponentClass.js",
                                  :provides    ["createReactNativeComponentClass"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/findNodeHandle.js",
                                  :provides    ["findNodeHandle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/React.js",
                                  :provides    ["React"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNative.js",
                                  :provides    ["ReactNative"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeBaseComponent.js",
                                  :provides    ["ReactNativeBaseComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeBaseComponentEnvironment.js",
                                  :provides    ["ReactNativeBaseComponentEnvironment"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeDefaultInjection.js",
                                  :provides    ["ReactNativeDefaultInjection"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeDOMIDOperations.js",
                                  :provides    ["ReactNativeDOMIDOperations"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeEventEmitter.js",
                                  :provides    ["ReactNativeEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeGlobalInteractionHandler.js",
                                  :provides    ["ReactNativeGlobalInteractionHandler"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeGlobalResponderHandler.js",
                                  :provides    ["ReactNativeGlobalResponderHandler"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeMount.js",
                                  :provides    ["ReactNativeMount"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeReconcileTransaction.js",
                                  :provides    ["ReactNativeReconcileTransaction"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeStyleAttributes.js",
                                  :provides    ["ReactNativeStyleAttributes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeTagHandles.js",
                                  :provides    ["ReactNativeTagHandles"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeTextComponent.js",
                                  :provides    ["ReactNativeTextComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeViewAttributes.js",
                                  :provides    ["ReactNativeViewAttributes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/RKBackendNode/queryLayoutByID.js",
                                  :provides    ["queryLayoutByID"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Sample/Sample.android.js",
                                  :provides    ["Sample.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Sample/Sample.ios.js",
                                  :provides    ["Sample.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Settings/Settings.android.js",
                                  :provides    ["Settings.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Settings/Settings.ios.js",
                                  :provides    ["Settings.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Storage/AsyncStorage.ios.js",
                                  :provides    ["AsyncStorage.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/EdgeInsetsPropType.js",
                                  :provides    ["EdgeInsetsPropType"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/flattenStyle.js",
                                  :provides    ["flattenStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/LayoutPropTypes.js",
                                  :provides    ["LayoutPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/PointPropType.js",
                                  :provides    ["PointPropType"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/precomputeStyle.js",
                                  :provides    ["precomputeStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/styleDiffer.js",
                                  :provides    ["styleDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheet.js",
                                  :provides    ["StyleSheet"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetPropType.js",
                                  :provides    ["StyleSheetPropType"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetRegistry.js",
                                  :provides    ["StyleSheetRegistry"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetValidation.js",
                                  :provides    ["StyleSheetValidation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/TransformPropTypes.js",
                                  :provides    ["TransformPropTypes"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Text/Text.js",
                                  :provides    ["Text"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Text/TextStylePropTypes.js",
                                  :provides    ["TextStylePropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Text/TextUpdateTest.js",
                                  :provides    ["TextUpdateTest"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__mocks__/ErrorUtils.js",
                                  :provides    ["ErrorUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__mocks__/PixelRatio.js",
                                  :provides    ["PixelRatio"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__tests__/MatrixMath-test.js",
                                  :provides    ["MatrixMath-test"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/AlertIOS.js",
                                  :provides    ["AlertIOS"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/BackAndroid.ios.js",
                                  :provides    ["BackAndroid.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/BridgeProfiling.js",
                                  :provides    ["BridgeProfiling"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/buildStyleInterpolator.js",
                                  :provides    ["buildStyleInterpolator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/createStrictShapeTypeChecker.js",
                                  :provides    ["createStrictShapeTypeChecker"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/cssVar.js",
                                  :provides    ["cssVar"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/CSSVarConfig.js",
                                  :provides    ["CSSVarConfig"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/deepFreezeAndThrowOnMutationInDev.js",
                                  :provides    ["deepFreezeAndThrowOnMutationInDev"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/__tests__/deepDiffer-test.js",
                                  :provides    ["deepDiffer-test"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/deepDiffer.js",
                                  :provides    ["deepDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/insetsDiffer.js",
                                  :provides    ["insetsDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/matricesDiffer.js",
                                  :provides    ["matricesDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/pointsDiffer.js",
                                  :provides    ["pointsDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/sizesDiffer.js",
                                  :provides    ["sizesDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/Dimensions.js",
                                  :provides    ["Dimensions"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/ErrorUtils.js",
                                  :provides    ["ErrorUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/groupByEveryN.js",
                                  :provides    ["groupByEveryN"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/logError.js",
                                  :provides    ["logError"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mapWithSeparator.js",
                                  :provides    ["mapWithSeparator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/MatrixMath.js",
                                  :provides    ["MatrixMath"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mergeFast.js",
                                  :provides    ["mergeFast"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mergeIntoFast.js",
                                  :provides    ["mergeIntoFast"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/MessageQueue.js",
                                  :provides    ["MessageQueue"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/nativeModulePrefixNormalizer.js",
                                  :provides    ["nativeModulePrefixNormalizer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/PixelRatio.js",
                                  :provides    ["PixelRatio"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/Platform.ios.js",
                                  :provides    ["Platform.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/RCTLog.js",
                                  :provides    ["RCTLog"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/RCTRenderingPerf.js",
                                  :provides    ["RCTRenderingPerf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/stringifySafe.js",
                                  :provides    ["stringifySafe"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/truncate.js",
                                  :provides    ["truncate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/_shouldPolyfillES6Collection.js",
                                  :provides    ["_shouldPolyfillES6Collection"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/clearImmediate.js",
                                  :provides    ["clearImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/copyProperties.js",
                                  :provides    ["copyProperties"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/getObjectValues.js",
                                  :provides    ["getObjectValues"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/guid.js",
                                  :provides    ["guid"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/immediate/setImmediate.js",
                                  :provides    ["setImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/isEmpty.js",
                                  :provides    ["isEmpty"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/Map.js",
                                  :provides    ["Map"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/merge.js",
                                  :provides    ["merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/mergeHelpers.js",
                                  :provides    ["mergeHelpers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/mergeInto.js",
                                  :provides    ["mergeInto"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/Set.js",
                                  :provides    ["Set"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/setImmediate.js",
                                  :provides    ["setImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/throwImmediate.js",
                                  :provides    ["throwImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/toIterator.js",
                                  :provides    ["toIterator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/crypto/crc32.js",
                                  :provides    ["crc32"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/document/selection/DocumentSelectionState.js",
                                  :provides    ["DocumentSelectionState"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EmitterSubscription.js",
                                  :provides    ["EmitterSubscription"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventEmitter.js",
                                  :provides    ["EventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventEmitterWithHolding.js",
                                  :provides    ["EventEmitterWithHolding"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventHolder.js",
                                  :provides    ["EventHolder"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventSubscription.js",
                                  :provides    ["EventSubscription"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventSubscriptionVendor.js",
                                  :provides    ["EventSubscriptionVendor"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventValidator.js",
                                  :provides    ["EventValidator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/mixInEventEmitter.js",
                                  :provides    ["mixInEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/PanResponder.js",
                                  :provides    ["PanResponder"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderEventPlugin.js",
                                  :provides    ["ResponderEventPlugin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderSyntheticEvent.js",
                                  :provides    ["ResponderSyntheticEvent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderTouchHistoryStore.js",
                                  :provides    ["ResponderTouchHistoryStore"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/TouchHistoryMath.js",
                                  :provides    ["TouchHistoryMath"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/core/clamp.js",
                                  :provides    ["clamp"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/core/ReactInstanceHandles.js",
                                  :provides    ["ReactInstanceHandles"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/event/EventPropagators.js",
                                  :provides    ["EventPropagators"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/platform/NodeHandle.js",
                                  :provides    ["NodeHandle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/platformImplementations/universal/worker/UniversalWorkerNodeHandle.js",
                                  :provides    ["UniversalWorkerNodeHandle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/vendor/core/ExecutionEnvironment.ios.js",
                                  :provides    ["ExecutionEnvironment.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/interactions/Touchable/Touchable.js",
                                  :provides    ["Touchable"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/pooledClasses/BoundingDimensions.js",
                                  :provides    ["BoundingDimensions"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/pooledClasses/Position.js",
                                  :provides    ["Position"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/StaticContainer/StaticContainer.js",
                                  :provides    ["StaticContainer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Vibration/VibrationIOS.android.js",
                                  :provides    ["VibrationIOS.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Vibration/VibrationIOS.ios.js",
                                  :provides    ["VibrationIOS.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocket.android.js",
                                  :provides    ["WebSocket.android"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocket.ios.js",
                                  :provides    ["WebSocket.ios"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocketBase.js",
                                  :provides    ["WebSocketBase"],
                                  :module-type :commonjs}]}}]})
