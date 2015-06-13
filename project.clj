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
                                  :requires    ["NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AdSupport/AdSupportIOS.js",
                                  :provides    ["AdSupportIOS"],
                                  :requires    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/AnimationExperimental.js",
                                  :provides    ["AnimationExperimental"],
                                  :requires    ["NativeModules" "React" "AnimationUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/AnimationUtils.js",
                                  :provides    ["AnimationUtils"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/LayoutAnimation.js",
                                  :provides    ["LayoutAnimation"],
                                  :requires
                                               ["ReactPropTypes"
                                                "NativeModules"
                                                "createStrictShapeTypeChecker"
                                                "keyMirror"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Animation/POPAnimationMixin.js",
                                  :provides    ["POPAnimationMixin"],
                                  :requires    ["POPAnimation" "React" "invariant" "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppRegistry/AppRegistry.js",
                                  :provides    ["AppRegistry"],
                                  :requires    ["invariant" "renderApplication" "RCTRenderingPerf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppStateIOS/AppStateIOS.android.js",
                                  :provides    ["AppStateIOS.android"],
                                  :requires    ["warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/AppStateIOS/AppStateIOS.ios.js",
                                  :provides    ["AppStateIOS.ios"],
                                  :requires
                                               ["Map"
                                                "NativeModules"
                                                "RCTDeviceEventEmitter"
                                                "logError"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ART/ARTSerializablePath.js",
                                  :provides    ["ARTSerializablePath"],
                                  :requires    ["art/core/class.js" "art/core/path.js"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ART/ReactNativeART.js",
                                  :provides    ["ReactNativeART"],
                                  :requires
                                               ["art/core/color"
                                                "ARTSerializablePath"
                                                "art/core/transform"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "createReactNativeComponentClass"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/__mocks__/NativeModules.js",
                                  :provides    ["NativeModules"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/NativeModules.js",
                                  :provides    ["NativeModules"],
                                  :requires    ["BatchedBridge" "nativeModulePrefixNormalizer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/POPAnimation.js",
                                  :provides    ["POPAnimation"],
                                  :requires
                                               ["NativeModules"
                                                "ReactPropTypes"
                                                "createStrictShapeTypeChecker"
                                                "getObjectValues"
                                                "invariant"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTAlertManager.ios.js",
                                  :provides    ["RCTAlertManager.ios"],
                                  :requires    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTEventEmitter.js",
                                  :provides    ["RCTEventEmitter"],
                                  :requires    ["ReactNativeEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchedBridgedModules/RCTJSTimers.js",
                                  :provides    ["RCTJSTimers"],
                                  :requires    ["JSTimersExecution"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchingImplementation/BatchedBridge.js",
                                  :provides    ["BatchedBridge"],
                                  :requires    ["BatchedBridgeFactory" "MessageQueue"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/BatchedBridge/BatchingImplementation/BatchedBridgeFactory.js",
                                  :provides    ["BatchedBridgeFactory"],
                                  :requires    ["invariant" "keyMirror" "mapObject" "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CameraRoll/CameraRoll.js",
                                  :provides    ["CameraRoll"],
                                  :requires
                                               ["ReactPropTypes"
                                                "NativeModules"
                                                "createStrictShapeTypeChecker"
                                                "deepFreezeAndThrowOnMutationInDev"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ActivityIndicatorIOS/ActivityIndicatorIOS.ios.js",
                                  :provides    ["ActivityIndicatorIOS.ios"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleSheet"
                                                "View"
                                                "requireNativeComponent"
                                                "verifyPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/DatePicker/DatePickerIOS.ios.js",
                                  :provides    ["DatePickerIOS.ios"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactPropTypes"
                                                "React"
                                                "NativeModules"
                                                "StyleSheet"
                                                "View"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/MapView/MapView.js",
                                  :provides    ["MapView"],
                                  :requires
                                               ["EdgeInsetsPropType"
                                                "NativeMethodsMixin"
                                                "Platform"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "View"
                                                "createReactNativeComponentClass"
                                                "deepDiffer"
                                                "insetsDiffer"
                                                "merge"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Navigation/NavigatorIOS.ios.js",
                                  :provides    ["NavigatorIOS.ios"],
                                  :requires
                                               ["EventEmitter"
                                                "Image"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "NativeModules"
                                                "StyleSheet"
                                                "StaticContainer.react"
                                                "View"
                                                "createReactNativeComponentClass"
                                                "invariant"
                                                "logError"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ProgressViewIOS/ProgressViewIOS.android.js",
                                  :provides    ["ProgressViewIOS.android"],
                                  :requires    ["React" "StyleSheet" "Text" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ProgressViewIOS/ProgressViewIOS.ios.js",
                                  :provides    ["ProgressViewIOS.ios"],
                                  :requires
                                               ["Image"
                                                "NativeMethodsMixin"
                                                "NativeModules"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleSheet"
                                                "requireNativeComponent"
                                                "verifyPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ScrollResponder.js",
                                  :provides    ["ScrollResponder"],
                                  :requires
                                               ["NativeModules"
                                                "RCTDeviceEventEmitter"
                                                "React"
                                                "Subscribable"
                                                "TextInputState"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/ScrollView/ScrollView.js",
                                  :provides    ["ScrollView"],
                                  :requires
                                               ["EdgeInsetsPropType"
                                                "Platform"
                                                "PointPropType"
                                                "NativeModules"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "NativeModules"
                                                "ScrollResponder"
                                                "StyleSheet"
                                                "StyleSheetPropType"
                                                "View"
                                                "ViewStylePropTypes"
                                                "createReactNativeComponentClass"
                                                "deepDiffer"
                                                "flattenStyle"
                                                "insetsDiffer"
                                                "invariant"
                                                "pointsDiffer"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SegmentedControlIOS/SegmentedControlIOS.android.js",
                                  :provides    ["SegmentedControlIOS.android"],
                                  :requires    ["React" "StyleSheet" "Text" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SegmentedControlIOS/SegmentedControlIOS.ios.js",
                                  :provides    ["SegmentedControlIOS.ios"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "NativeModules"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleSheet"
                                                "requireNativeComponent"
                                                "verifyPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SliderIOS/SliderIOS.js",
                                  :provides    ["SliderIOS"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleSheet"
                                                "View"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/StaticRenderer.js",
                                  :provides    ["StaticRenderer"],
                                  :requires    ["React"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/StatusBar/StatusBarIOS.ios.js",
                                  :provides    ["StatusBarIOS.ios"],
                                  :requires    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Subscribable.js",
                                  :provides    ["Subscribable"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SwitchIOS/SwitchIOS.android.js",
                                  :provides    ["SwitchIOS.android"],
                                  :requires    ["React" "StyleSheet" "Text" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/SwitchIOS/SwitchIOS.ios.js",
                                  :provides    ["SwitchIOS.ios"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleSheet"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarIOS.android.js",
                                  :provides    ["TabBarIOS.android"],
                                  :requires    ["React" "View" "StyleSheet"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarIOS.ios.js",
                                  :provides    ["TabBarIOS.ios"],
                                  :requires
                                               ["React"
                                                "StyleSheet"
                                                "TabBarItemIOS"
                                                "View"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarItemIOS.android.js",
                                  :provides    ["TabBarItemIOS.android"],
                                  :requires    ["React" "View" "StyleSheet"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TabBarIOS/TabBarItemIOS.ios.js",
                                  :provides    ["TabBarItemIOS.ios"],
                                  :requires
                                               ["Image"
                                                "React"
                                                "StaticContainer.react"
                                                "StyleSheet"
                                                "View"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TextInput/TextInput.js",
                                  :provides    ["TextInput"],
                                  :requires
                                               ["DocumentSelectionState"
                                                "EventEmitter"
                                                "NativeMethodsMixin"
                                                "NativeModules"
                                                "Platform"
                                                "ReactPropTypes"
                                                "React"
                                                "ReactChildren"
                                                "StyleSheet"
                                                "Text"
                                                "TextInputState"
                                                "react-timer-mixin"
                                                "TouchableWithoutFeedback"
                                                "createReactNativeComponentClass"
                                                "emptyFunction"
                                                "invariant"
                                                "requireNativeComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/TextInput/TextInputState.js",
                                  :provides    ["TextInputState"],
                                  :requires    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/ensureComponentIsNative.js",
                                  :provides    ["ensureComponentIsNative"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/ensurePositiveDelayProps.js",
                                  :provides    ["ensurePositiveDelayProps"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableBounce.js",
                                  :provides    ["TouchableBounce"],
                                  :requires
                                               ["AnimationExperimental"
                                                "NativeMethodsMixin"
                                                "POPAnimation"
                                                "React"
                                                "Touchable"
                                                "merge"
                                                "onlyChild"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableHighlight.js",
                                  :provides    ["TouchableHighlight"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "StyleSheet"
                                                "react-timer-mixin"
                                                "Touchable"
                                                "TouchableWithoutFeedback"
                                                "View"
                                                "cloneWithProps"
                                                "ensureComponentIsNative"
                                                "ensurePositiveDelayProps"
                                                "keyOf"
                                                "merge"
                                                "onlyChild"
                                                "image!myButton"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableOpacity.js",
                                  :provides    ["TouchableOpacity"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "POPAnimationMixin"
                                                "React"
                                                "react-timer-mixin"
                                                "Touchable"
                                                "TouchableWithoutFeedback"
                                                "cloneWithProps"
                                                "ensureComponentIsNative"
                                                "ensurePositiveDelayProps"
                                                "flattenStyle"
                                                "keyOf"
                                                "onlyChild"
                                                "image!myButton"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/Touchable/TouchableWithoutFeedback.js",
                                  :provides    ["TouchableWithoutFeedback"],
                                  :requires
                                               ["React"
                                                "react-timer-mixin"
                                                "Touchable"
                                                "ensurePositiveDelayProps"
                                                "onlyChild"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/UnimplementedViews/UnimplementedView.js",
                                  :provides    ["UnimplementedView"],
                                  :requires    ["React" "StyleSheet" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/View/View.js",
                                  :provides    ["View"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactPropTypes"
                                                "NativeModules"
                                                "React"
                                                "ReactNativeStyleAttributes"
                                                "ReactNativeViewAttributes"
                                                "StyleSheetPropType"
                                                "ViewStylePropTypes"
                                                "createReactNativeComponentClass"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/View/ViewStylePropTypes.js",
                                  :provides    ["ViewStylePropTypes"],
                                  :requires    ["LayoutPropTypes" "ReactPropTypes" "TransformPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/WebView/WebView.android.js",
                                  :provides    ["WebView.android"],
                                  :requires
                                               ["EdgeInsetsPropType"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "StyleSheet"
                                                "View"
                                                "createReactNativeComponentClass"
                                                "keyMirror"
                                                "merge"
                                                "NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Components/WebView/WebView.ios.js",
                                  :provides    ["WebView.ios"],
                                  :requires
                                               ["ActivityIndicatorIOS"
                                                "EdgeInsetsPropType"
                                                "React"
                                                "StyleSheet"
                                                "Text"
                                                "View"
                                                "invariant"
                                                "keyMirror"
                                                "requireNativeComponent"
                                                "NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/ListView/ListView.js",
                                  :provides    ["ListView"],
                                  :requires
                                               ["ListViewDataSource"
                                                "React"
                                                "NativeModules"
                                                "ScrollView"
                                                "ScrollResponder"
                                                "StaticRenderer"
                                                "react-timer-mixin"
                                                "logError"
                                                "merge"
                                                "isEmpty"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/ListView/ListViewDataSource.js",
                                  :provides    ["ListViewDataSource"],
                                  :requires    ["invariant" "isEmpty" "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/Navigator.js",
                                  :provides    ["Navigator"],
                                  :requires
                                               ["NativeModules"
                                                "Dimensions"
                                                "InteractionMixin"
                                                "NavigatorBreadcrumbNavigationBar"
                                                "NavigatorNavigationBar"
                                                "NavigatorSceneConfigs"
                                                "PanResponder"
                                                "Platform"
                                                "React"
                                                "StaticContainer.react"
                                                "StyleSheet"
                                                "Subscribable"
                                                "react-timer-mixin"
                                                "View"
                                                "clamp"
                                                "flattenStyle"
                                                "invariant"
                                                "rebound"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorBreadcrumbNavigationBar.js",
                                  :provides    ["NavigatorBreadcrumbNavigationBar"],
                                  :requires
                                               ["NavigatorBreadcrumbNavigationBarStyles"
                                                "NavigatorNavigationBarStyles"
                                                "React"
                                                "StaticContainer.react"
                                                "StyleSheet"
                                                "View"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorBreadcrumbNavigationBarStyles.ios.js",
                                  :provides    ["NavigatorBreadcrumbNavigationBarStyles.ios"],
                                  :requires
                                               ["Dimensions"
                                                "NavigatorNavigationBarStyles"
                                                "buildStyleInterpolator"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorNavigationBar.js",
                                  :provides    ["NavigatorNavigationBar"],
                                  :requires
                                               ["React"
                                                "NavigatorNavigationBarStyles"
                                                "StaticContainer.react"
                                                "StyleSheet"
                                                "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorNavigationBarStyles.ios.js",
                                  :provides    ["NavigatorNavigationBarStyles.ios"],
                                  :requires    ["Dimensions" "buildStyleInterpolator" "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/CustomComponents/Navigator/NavigatorSceneConfigs.js",
                                  :provides    ["NavigatorSceneConfigs"],
                                  :requires    ["Dimensions" "PixelRatio" "buildStyleInterpolator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Device/RCTDeviceEventEmitter.js",
                                  :provides    ["RCTDeviceEventEmitter"],
                                  :requires    ["EventEmitter"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Fetch/fetch.js",
                                  :provides    ["fetch"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Geolocation/Geolocation.js",
                                  :provides    ["Geolocation"],
                                  :requires
                                               ["RCTDeviceEventEmitter"
                                                "NativeModules"
                                                "invariant"
                                                "logError"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/__tests__/resolveAssetSource-test.js",
                                  :provides    ["resolveAssetSource-test"],
                                  :requires
                                               ["AssetRegistry" "Platform" "NativeModules" "../resolveAssetSource"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/AssetRegistry.js",
                                  :provides    ["AssetRegistry"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/Image.ios.js",
                                  :provides    ["Image.ios"],
                                  :requires
                                               ["EdgeInsetsPropType"
                                                "ImageResizeMode"
                                                "ImageStylePropTypes"
                                                "NativeMethodsMixin"
                                                "NativeModules"
                                                "ReactPropTypes"
                                                "React"
                                                "ReactNativeViewAttributes"
                                                "StyleSheet"
                                                "StyleSheetPropType"
                                                "flattenStyle"
                                                "invariant"
                                                "merge"
                                                "requireNativeComponent"
                                                "resolveAssetSource"
                                                "verifyPropTypes"
                                                "warning"
                                                "image!myIcon"
                                                "image!name"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageResizeMode.js",
                                  :provides    ["ImageResizeMode"],
                                  :requires    ["keyMirror"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageSource.js",
                                  :provides    ["ImageSource"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/ImageStylePropTypes.js",
                                  :provides    ["ImageStylePropTypes"],
                                  :requires
                                               ["ImageResizeMode"
                                                "LayoutPropTypes"
                                                "ReactPropTypes"
                                                "TransformPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Image/resolveAssetSource.js",
                                  :provides    ["resolveAssetSource"],
                                  :requires    ["AssetRegistry" "PixelRatio" "Platform" "NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/BorderBox.js",
                                  :provides    ["BorderBox"],
                                  :requires    ["React" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/BoxInspector.js",
                                  :provides    ["BoxInspector"],
                                  :requires    ["React" "StyleSheet" "Text" "View" "resolveBoxStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/ElementBox.js",
                                  :provides    ["ElementBox"],
                                  :requires
                                               ["React"
                                                "View"
                                                "StyleSheet"
                                                "BorderBox"
                                                "resolveBoxStyle"
                                                "flattenStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/ElementProperties.js",
                                  :provides    ["ElementProperties"],
                                  :requires
                                               ["BoxInspector"
                                                "ReactPropTypes"
                                                "React"
                                                "StyleInspector"
                                                "StyleSheet"
                                                "Text"
                                                "TouchableHighlight"
                                                "TouchableWithoutFeedback"
                                                "View"
                                                "flattenStyle"
                                                "mapWithSeparator"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/Inspector.js",
                                  :provides    ["Inspector"],
                                  :requires
                                               ["Dimensions"
                                                "InspectorOverlay"
                                                "InspectorPanel"
                                                "InspectorUtils"
                                                "React"
                                                "StyleSheet"
                                                "NativeModules"
                                                "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorOverlay.js",
                                  :provides    ["InspectorOverlay"],
                                  :requires
                                               ["Dimensions"
                                                "InspectorUtils"
                                                "React"
                                                "StyleSheet"
                                                "NativeModules"
                                                "View"
                                                "ElementBox"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorPanel.js",
                                  :provides    ["InspectorPanel"],
                                  :requires
                                               ["React"
                                                "StyleSheet"
                                                "Text"
                                                "View"
                                                "ElementProperties"
                                                "TouchableHighlight"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/InspectorUtils.js",
                                  :provides    ["InspectorUtils"],
                                  :requires
                                               ["ReactInstanceHandles"
                                                "ReactInstanceMap"
                                                "ReactNativeMount"
                                                "ReactNativeTagHandles"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/resolveBoxStyle.js",
                                  :provides    ["resolveBoxStyle"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Inspector/StyleInspector.js",
                                  :provides    ["StyleInspector"],
                                  :requires    ["React" "StyleSheet" "Text" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Interaction/InteractionManager.js",
                                  :provides    ["InteractionManager"],
                                  :requires
                                               ["ErrorUtils"
                                                "EventEmitter"
                                                "Set"
                                                "invariant"
                                                "keyMirror"
                                                "setImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Interaction/InteractionMixin.js",
                                  :provides    ["InteractionMixin"],
                                  :requires    ["InteractionManager"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/ExceptionsManager.js",
                                  :provides    ["ExceptionsManager"],
                                  :requires
                                               ["NativeModules" "loadSourceMap" "parseErrorStack" "stringifySafe"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/InitializeJavaScriptAppEngine.js",
                                  :provides    ["InitializeJavaScriptAppEngine"],
                                  :requires
                                               ["RCTDeviceEventEmitter"
                                                "ExceptionsManager"
                                                "ErrorUtils"
                                                "ExceptionsManager"
                                                "Platform"
                                                "JSTimers"
                                                "NativeModules"
                                                "Promise"
                                                "XMLHttpRequest"
                                                "FormData"
                                                "fetch"
                                                "Geolocation"
                                                "WebSocket"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/loadSourceMap.js",
                                  :provides    ["loadSourceMap"],
                                  :requires    ["Promise" "NativeModules" "SourceMap" "./source-map-url"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/parseErrorStack.js",
                                  :provides    ["parseErrorStack"],
                                  :requires    ["stacktrace-parser"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/source-map-url.js",
                                  :provides    ["source-map-url"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/Initialization/SourceMap.js",
                                  :provides    ["SourceMap"],
                                  :requires
                                               ["./base64-vlq"
                                                "./util"
                                                "./array-set"
                                                "./base64"
                                                "./util"
                                                "./util"
                                                "./binary-search"
                                                "./array-set"
                                                "./base64-vlq"
                                                "./source-map-generator"
                                                "./util"
                                                "source-map/source-map-consumer"
                                                "source-map/source-map-generator"
                                                "source-map/source-node"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/polyfills/document.js",
                                  :provides    ["document"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/System/JSTimers/JSTimers.js",
                                  :provides    ["JSTimers"],
                                  :requires    ["NativeModules" "JSTimersExecution"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/JavaScriptAppEngine/System/JSTimers/JSTimersExecution.js",
                                  :provides    ["JSTimersExecution"],
                                  :requires
                                               ["invariant"
                                                "keyMirror"
                                                "performanceNow"
                                                "warning"
                                                "JSTimers"
                                                "JSTimers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/LinkingIOS/LinkingIOS.js",
                                  :provides    ["LinkingIOS"],
                                  :requires
                                               ["RCTDeviceEventEmitter" "NativeModules" "Map" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/NativeApp/RCTNativeAppEventEmitter.js",
                                  :provides    ["RCTNativeAppEventEmitter"],
                                  :requires    ["EventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/FormData.js",
                                  :provides    ["FormData"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/NetInfo.js",
                                  :provides    ["NetInfo"],
                                  :requires    ["NativeModules" "Platform" "RCTDeviceEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/XMLHttpRequest.ios.js",
                                  :provides    ["XMLHttpRequest.ios"],
                                  :requires
                                               ["FormData"
                                                "NativeModules"
                                                "RCTDeviceEventEmitter"
                                                "XMLHttpRequestBase"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Network/XMLHttpRequestBase.js",
                                  :provides    ["XMLHttpRequestBase"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Picker/PickerIOS.android.js",
                                  :provides    ["PickerIOS.android"],
                                  :requires    ["UnimplementedView"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Picker/PickerIOS.ios.js",
                                  :provides    ["PickerIOS.ios"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "React"
                                                "ReactChildren"
                                                "ReactNativeViewAttributes"
                                                "NativeModules"
                                                "StyleSheet"
                                                "View"
                                                "requireNativeComponent"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Promise.js",
                                  :provides    ["Promise"],
                                  :requires
                                               ["setImmediate"
                                                "promise/setimmediate/es6-extensions"
                                                "promise/setimmediate/done"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/PushNotificationIOS/PushNotificationIOS.js",
                                  :provides    ["PushNotificationIOS"],
                                  :requires
                                               ["Map" "RCTDeviceEventEmitter" "NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/react-native/react-native-interface.js",
                                  :provides    ["react-native-interface"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/react-native/react-native.js",
                                  :provides    ["react-native"],
                                  :requires
                                               ["React"
                                                "React"
                                                "ActivityIndicatorIOS"
                                                "DatePickerIOS"
                                                "Image"
                                                "ListView"
                                                "MapView"
                                                "Navigator"
                                                "NavigatorIOS"
                                                "PickerIOS"
                                                "ProgressViewIOS"
                                                "ScrollView"
                                                "SegmentedControlIOS"
                                                "SliderIOS"
                                                "SwitchIOS"
                                                "TabBarIOS"
                                                "Text"
                                                "TextInput"
                                                "TouchableHighlight"
                                                "TouchableOpacity"
                                                "TouchableWithoutFeedback"
                                                "View"
                                                "WebView"
                                                "AlertIOS"
                                                "AppRegistry"
                                                "AppStateIOS"
                                                "AsyncStorage"
                                                "CameraRoll"
                                                "InteractionManager"
                                                "LayoutAnimation"
                                                "LinkingIOS"
                                                "NetInfo"
                                                "PanResponder"
                                                "PixelRatio"
                                                "PushNotificationIOS"
                                                "StatusBarIOS"
                                                "StyleSheet"
                                                "VibrationIOS"
                                                "RCTDeviceEventEmitter"
                                                "RCTNativeAppEventEmitter"
                                                "NativeModules"
                                                "Platform"
                                                "requireNativeComponent"
                                                "EdgeInsetsPropType"
                                                "PointPropType"
                                                "LinkedStateMixin"
                                                "ReactComponentWithPureRenderMixin"
                                                "NativeModules"
                                                "ReactUpdates"
                                                "cloneWithProps"
                                                "ReactFragment"
                                                "update"
                                                "ReactDefaultPerf"
                                                "ReactTestUtils"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/diffRawProperties.js",
                                  :provides    ["diffRawProperties"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/IOSDefaultEventPluginOrder.js",
                                  :provides    ["IOSDefaultEventPluginOrder"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/IOSNativeBridgeEventPlugin.js",
                                  :provides    ["IOSNativeBridgeEventPlugin"],
                                  :requires
                                               ["EventPropagators"
                                                "NativeModules"
                                                "SyntheticEvent"
                                                "merge"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/NativeMethodsMixin.js",
                                  :provides    ["NativeMethodsMixin"],
                                  :requires
                                               ["NativeModules"
                                                "TextInputState"
                                                "findNodeHandle"
                                                "flattenStyle"
                                                "invariant"
                                                "mergeFast"
                                                "precomputeStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/renderApplication.ios.js",
                                  :provides    ["renderApplication.ios"],
                                  :requires
                                               ["Inspector"
                                                "RCTDeviceEventEmitter"
                                                "React"
                                                "StyleSheet"
                                                "Subscribable"
                                                "View"
                                                "WarningBox"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/requireNativeComponent.js",
                                  :provides    ["requireNativeComponent"],
                                  :requires
                                               ["NativeModules"
                                                "UnimplementedView"
                                                "createReactNativeComponentClass"
                                                "deepDiffer"
                                                "insetsDiffer"
                                                "pointsDiffer"
                                                "matricesDiffer"
                                                "sizesDiffer"
                                                "verifyPropTypes"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/verifyPropTypes.js",
                                  :provides    ["verifyPropTypes"],
                                  :requires    ["ReactNativeStyleAttributes" "View"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactIOS/WarningBox.js",
                                  :provides    ["WarningBox"],
                                  :requires
                                               ["AsyncStorage"
                                                "EventEmitter"
                                                "Map"
                                                "PanResponder"
                                                "React"
                                                "StyleSheet"
                                                "Text"
                                                "TouchableOpacity"
                                                "View"
                                                "invariant"
                                                "rebound"
                                                "stringifySafe"
                                                "Dimensions').get('window"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/createReactNativeComponentClass.js",
                                  :provides    ["createReactNativeComponentClass"],
                                  :requires    ["ReactNativeBaseComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/findNodeHandle.js",
                                  :provides    ["findNodeHandle"],
                                  :requires
                                               ["ReactCurrentOwner"
                                                "ReactInstanceMap"
                                                "ReactNativeTagHandles"
                                                "invariant"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/React.js",
                                  :provides    ["React"],
                                  :requires    ["ReactNative"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNative.js",
                                  :provides    ["ReactNative"],
                                  :requires
                                               ["ReactChildren"
                                                "ReactClass"
                                                "ReactComponent"
                                                "ReactContext"
                                                "ReactCurrentOwner"
                                                "ReactElement"
                                                "ReactElementValidator"
                                                "ReactInstanceHandles"
                                                "ReactNativeDefaultInjection"
                                                "ReactNativeMount"
                                                "ReactPropTypes"
                                                "deprecated"
                                                "findNodeHandle"
                                                "invariant"
                                                "onlyChild"
                                                "ReactReconciler"
                                                "ReactNativeTextComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeBaseComponent.js",
                                  :provides    ["ReactNativeBaseComponent"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "ReactNativeEventEmitter"
                                                "ReactNativeStyleAttributes"
                                                "ReactNativeTagHandles"
                                                "ReactMultiChild"
                                                "NativeModules"
                                                "styleDiffer"
                                                "deepFreezeAndThrowOnMutationInDev"
                                                "diffRawProperties"
                                                "flattenStyle"
                                                "precomputeStyle"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeBaseComponentEnvironment.js",
                                  :provides    ["ReactNativeBaseComponentEnvironment"],
                                  :requires
                                               ["ReactNativeDOMIDOperations" "ReactNativeReconcileTransaction"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeDefaultInjection.js",
                                  :provides    ["ReactNativeDefaultInjection"],
                                  :requires
                                               ["InitializeJavaScriptAppEngine"
                                                "EventPluginHub"
                                                "EventPluginUtils"
                                                "IOSDefaultEventPluginOrder"
                                                "IOSNativeBridgeEventPlugin"
                                                "NodeHandle"
                                                "ReactComponentEnvironment"
                                                "ReactDefaultBatchingStrategy"
                                                "ReactEmptyComponent"
                                                "ReactInstanceHandles"
                                                "ReactNativeComponentEnvironment"
                                                "ReactNativeGlobalInteractionHandler"
                                                "ReactNativeGlobalResponderHandler"
                                                "ReactNativeMount"
                                                "ReactNativeTextComponent"
                                                "ReactNativeComponent"
                                                "ReactUpdates"
                                                "ResponderEventPlugin"
                                                "UniversalWorkerNodeHandle"
                                                "createReactNativeComponentClass"
                                                "invariant"
                                                "RCTEventEmitter"
                                                "RCTLog"
                                                "RCTJSTimers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeDOMIDOperations.js",
                                  :provides    ["ReactNativeDOMIDOperations"],
                                  :requires
                                               ["ReactNativeTagHandles"
                                                "ReactMultiChildUpdateTypes"
                                                "NativeModules"
                                                "ReactPerf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeEventEmitter.js",
                                  :provides    ["ReactNativeEventEmitter"],
                                  :requires
                                               ["EventPluginHub"
                                                "ReactEventEmitterMixin"
                                                "ReactNativeTagHandles"
                                                "NodeHandle"
                                                "EventConstants"
                                                "merge"
                                                "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeGlobalInteractionHandler.js",
                                  :provides    ["ReactNativeGlobalInteractionHandler"],
                                  :requires    ["InteractionManager"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeGlobalResponderHandler.js",
                                  :provides    ["ReactNativeGlobalResponderHandler"],
                                  :requires    ["NativeModules" "ReactNativeTagHandles"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeMount.js",
                                  :provides    ["ReactNativeMount"],
                                  :requires
                                               ["NativeModules"
                                                "ReactNativeTagHandles"
                                                "ReactPerf"
                                                "ReactReconciler"
                                                "ReactUpdateQueue"
                                                "ReactUpdates"
                                                "emptyObject"
                                                "instantiateReactComponent"
                                                "shouldUpdateReactComponent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeReconcileTransaction.js",
                                  :provides    ["ReactNativeReconcileTransaction"],
                                  :requires    ["CallbackQueue" "PooledClass" "Transaction"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeStyleAttributes.js",
                                  :provides    ["ReactNativeStyleAttributes"],
                                  :requires
                                               ["ImageStylePropTypes"
                                                "TextStylePropTypes"
                                                "ViewStylePropTypes"
                                                "keyMirror"
                                                "matricesDiffer"
                                                "sizesDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeTagHandles.js",
                                  :provides    ["ReactNativeTagHandles"],
                                  :requires    ["invariant" "warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeTextComponent.js",
                                  :provides    ["ReactNativeTextComponent"],
                                  :requires    ["ReactNativeTagHandles" "NativeModules" "Object.assign"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/ReactNative/ReactNativeViewAttributes.js",
                                  :provides    ["ReactNativeViewAttributes"],
                                  :requires    ["merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/RKBackendNode/queryLayoutByID.js",
                                  :provides    ["queryLayoutByID"],
                                  :requires    ["ReactNativeTagHandles" "NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Sample/Sample.android.js",
                                  :provides    ["Sample.android"],
                                  :requires    ["warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Sample/Sample.ios.js",
                                  :provides    ["Sample.ios"],
                                  :requires    ["NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Settings/Settings.android.js",
                                  :provides    ["Settings.android"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Settings/Settings.ios.js",
                                  :provides    ["Settings.ios"],
                                  :requires    ["RCTDeviceEventEmitter" "NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Storage/AsyncStorage.ios.js",
                                  :provides    ["AsyncStorage.ios"],
                                  :requires    ["NativeModules"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/EdgeInsetsPropType.js",
                                  :provides    ["EdgeInsetsPropType"],
                                  :requires    ["ReactPropTypes" "createStrictShapeTypeChecker"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/flattenStyle.js",
                                  :provides    ["flattenStyle"],
                                  :requires    ["StyleSheetRegistry" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/LayoutPropTypes.js",
                                  :provides    ["LayoutPropTypes"],
                                  :requires    ["ReactPropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/PointPropType.js",
                                  :provides    ["PointPropType"],
                                  :requires    ["ReactPropTypes" "createStrictShapeTypeChecker"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/precomputeStyle.js",
                                  :provides    ["precomputeStyle"],
                                  :requires
                                               ["MatrixMath"
                                                "Platform"
                                                "deepFreezeAndThrowOnMutationInDev"
                                                "invariant"
                                                "stringifySafe"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/styleDiffer.js",
                                  :provides    ["styleDiffer"],
                                  :requires    ["deepDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheet.js",
                                  :provides    ["StyleSheet"],
                                  :requires    ["StyleSheetRegistry" "StyleSheetValidation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetPropType.js",
                                  :provides    ["StyleSheetPropType"],
                                  :requires    ["createStrictShapeTypeChecker" "flattenStyle"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetRegistry.js",
                                  :provides    ["StyleSheetRegistry"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/StyleSheetValidation.js",
                                  :provides    ["StyleSheetValidation"],
                                  :requires
                                               ["ImageStylePropTypes"
                                                "ReactPropTypeLocations"
                                                "TextStylePropTypes"
                                                "ViewStylePropTypes"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/StyleSheet/TransformPropTypes.js",
                                  :provides    ["TransformPropTypes"],
                                  :requires    ["ReactPropTypes"],
                                  :module-type :commonjs}
                                 {:file        "Libraries/Text/Text.js",
                                  :provides    ["Text"],
                                  :requires
                                               ["NativeMethodsMixin"
                                                "Platform"
                                                "React"
                                                "ReactInstanceMap"
                                                "ReactNativeViewAttributes"
                                                "StyleSheetPropType"
                                                "TextStylePropTypes"
                                                "Touchable"
                                                "createReactNativeComponentClass"
                                                "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Text/TextStylePropTypes.js",
                                  :provides    ["TextStylePropTypes"],
                                  :requires    ["ReactPropTypes" "ViewStylePropTypes"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Text/TextUpdateTest.js",
                                  :provides    ["TextUpdateTest"],
                                  :requires    ["react-native" "react-timer-mixin"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__mocks__/ErrorUtils.js",
                                  :provides    ["ErrorUtils"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__mocks__/PixelRatio.js",
                                  :provides    ["PixelRatio"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/__tests__/MatrixMath-test.js",
                                  :provides    ["MatrixMath-test"],
                                  :requires    ["MatrixMath"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/AlertIOS.js",
                                  :provides    ["AlertIOS"],
                                  :requires    ["NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/BackAndroid.ios.js",
                                  :provides    ["BackAndroid.ios"],
                                  :requires    ["warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/BridgeProfiling.js",
                                  :provides    ["BridgeProfiling"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/buildStyleInterpolator.js",
                                  :provides    ["buildStyleInterpolator"],
                                  :requires    ["keyOf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/createStrictShapeTypeChecker.js",
                                  :provides    ["createStrictShapeTypeChecker"],
                                  :requires    ["ReactPropTypeLocationNames" "invariant" "merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/cssVar.js",
                                  :provides    ["cssVar"],
                                  :requires    ["invariant" "CSSVarConfig"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/CSSVarConfig.js",
                                  :provides    ["CSSVarConfig"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/deepFreezeAndThrowOnMutationInDev.js",
                                  :provides    ["deepFreezeAndThrowOnMutationInDev"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/__tests__/deepDiffer-test.js",
                                  :provides    ["deepDiffer-test"],
                                  :requires    ["deepDiffer"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/deepDiffer.js",
                                  :provides    ["deepDiffer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/insetsDiffer.js",
                                  :provides    ["insetsDiffer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/matricesDiffer.js",
                                  :provides    ["matricesDiffer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/pointsDiffer.js",
                                  :provides    ["pointsDiffer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/differ/sizesDiffer.js",
                                  :provides    ["sizesDiffer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/Dimensions.js",
                                  :provides    ["Dimensions"],
                                  :requires    ["NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/ErrorUtils.js",
                                  :provides    ["ErrorUtils"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/groupByEveryN.js",
                                  :provides    ["groupByEveryN"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/logError.js",
                                  :provides    ["logError"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mapWithSeparator.js",
                                  :provides    ["mapWithSeparator"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/MatrixMath.js",
                                  :provides    ["MatrixMath"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mergeFast.js",
                                  :provides    ["mergeFast"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/mergeIntoFast.js",
                                  :provides    ["mergeIntoFast"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/MessageQueue.js",
                                  :provides    ["MessageQueue"],
                                  :requires
                                               ["ErrorUtils"
                                                "ReactUpdates"
                                                "invariant"
                                                "warning"
                                                "BridgeProfiling"
                                                "JSTimersExecution"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/nativeModulePrefixNormalizer.js",
                                  :provides    ["nativeModulePrefixNormalizer"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/PixelRatio.js",
                                  :provides    ["PixelRatio"],
                                  :requires    ["Dimensions"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/Platform.ios.js",
                                  :provides    ["Platform.ios"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/RCTLog.js",
                                  :provides    ["RCTLog"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/RCTRenderingPerf.js",
                                  :provides    ["RCTRenderingPerf"],
                                  :requires    ["ReactDefaultPerf" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/stringifySafe.js",
                                  :provides    ["stringifySafe"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Utilities/truncate.js",
                                  :provides    ["truncate"],
                                  :requires    ["merge"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/_shouldPolyfillES6Collection.js",
                                  :provides    ["_shouldPolyfillES6Collection"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/clearImmediate.js",
                                  :provides    ["clearImmediate"],
                                  :requires    ["ImmediateImplementation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/copyProperties.js",
                                  :provides    ["copyProperties"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/getObjectValues.js",
                                  :provides    ["getObjectValues"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/guid.js",
                                  :provides    ["guid"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/immediate/setImmediate.js",
                                  :provides    ["setImmediate"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/isEmpty.js",
                                  :provides    ["isEmpty"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/Map.js",
                                  :provides    ["Map"],
                                  :requires
                                               ["guid" "isNode" "toIterator" "_shouldPolyfillES6Collection"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/merge.js",
                                  :provides    ["merge"],
                                  :requires    ["mergeInto"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/mergeHelpers.js",
                                  :provides    ["mergeHelpers"],
                                  :requires    ["invariant" "keyMirror"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/mergeInto.js",
                                  :provides    ["mergeInto"],
                                  :requires    ["mergeHelpers"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/Set.js",
                                  :provides    ["Set"],
                                  :requires    ["Map" "toIterator" "_shouldPolyfillES6Collection"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/setImmediate.js",
                                  :provides    ["setImmediate"],
                                  :requires    ["ImmediateImplementation"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/throwImmediate.js",
                                  :provides    ["throwImmediate"],
                                  :requires    ["setImmediate"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/core/toIterator.js",
                                  :provides    ["toIterator"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/crypto/crc32.js",
                                  :provides    ["crc32"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/document/selection/DocumentSelectionState.js",
                                  :provides    ["DocumentSelectionState"],
                                  :requires    ["mixInEventEmitter"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EmitterSubscription.js",
                                  :provides    ["EmitterSubscription"],
                                  :requires    ["EventSubscription"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventEmitter.js",
                                  :provides    ["EventEmitter"],
                                  :requires
                                               ["EmitterSubscription"
                                                "ErrorUtils"
                                                "EventSubscriptionVendor"
                                                "emptyFunction"
                                                "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventEmitterWithHolding.js",
                                  :provides    ["EventEmitterWithHolding"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventHolder.js",
                                  :provides    ["EventHolder"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventSubscription.js",
                                  :provides    ["EventSubscription"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventSubscriptionVendor.js",
                                  :provides    ["EventSubscriptionVendor"],
                                  :requires    ["invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/EventValidator.js",
                                  :provides    ["EventValidator"],
                                  :requires    ["copyProperties"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/emitter/mixInEventEmitter.js",
                                  :provides    ["mixInEventEmitter"],
                                  :requires
                                               ["EventEmitter"
                                                "EventEmitterWithHolding"
                                                "EventHolder"
                                                "EventValidator"
                                                "copyProperties"
                                                "invariant"
                                                "keyOf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/PanResponder.js",
                                  :provides    ["PanResponder"],
                                  :requires    ["TouchHistoryMath"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderEventPlugin.js",
                                  :provides    ["ResponderEventPlugin"],
                                  :requires
                                               ["EventConstants"
                                                "EventPluginUtils"
                                                "EventPropagators"
                                                "NodeHandle"
                                                "ReactInstanceHandles"
                                                "ResponderSyntheticEvent"
                                                "ResponderTouchHistoryStore"
                                                "accumulate"
                                                "invariant"
                                                "keyOf"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderSyntheticEvent.js",
                                  :provides    ["ResponderSyntheticEvent"],
                                  :requires    ["SyntheticEvent"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/ResponderTouchHistoryStore.js",
                                  :provides    ["ResponderTouchHistoryStore"],
                                  :requires    ["EventPluginUtils" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/browser/eventPlugins/TouchHistoryMath.js",
                                  :provides    ["TouchHistoryMath"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/core/clamp.js",
                                  :provides    ["clamp"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/core/ReactInstanceHandles.js",
                                  :provides    ["ReactInstanceHandles"],
                                  :requires    ["ReactRootIndex" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/event/EventPropagators.js",
                                  :provides    ["EventPropagators"],
                                  :requires
                                               ["EventConstants"
                                                "EventPluginHub"
                                                "accumulateInto"
                                                "forEachAccumulated"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/platform/NodeHandle.js",
                                  :provides    ["NodeHandle"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/platformImplementations/universal/worker/UniversalWorkerNodeHandle.js",
                                  :provides    ["UniversalWorkerNodeHandle"],
                                  :requires    ["ReactNativeTagHandles" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react/vendor/core/ExecutionEnvironment.ios.js",
                                  :provides    ["ExecutionEnvironment.ios"],
                                  :requires    [],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/interactions/Touchable/Touchable.js",
                                  :provides    ["Touchable"],
                                  :requires
                                               ["BoundingDimensions"
                                                "Position"
                                                "TouchEventUtils"
                                                "keyMirror"
                                                "queryLayoutByID"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/pooledClasses/BoundingDimensions.js",
                                  :provides    ["BoundingDimensions"],
                                  :requires    ["PooledClass"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/pooledClasses/Position.js",
                                  :provides    ["Position"],
                                  :requires    ["PooledClass"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/vendor/react_contrib/StaticContainer/StaticContainer.js",
                                  :provides    ["StaticContainer"],
                                  :requires    ["React" "onlyChild"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Vibration/VibrationIOS.android.js",
                                  :provides    ["VibrationIOS.android"],
                                  :requires    ["warning"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/Vibration/VibrationIOS.ios.js",
                                  :provides    ["VibrationIOS.ios"],
                                  :requires    ["NativeModules" "invariant"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocket.android.js",
                                  :provides    ["WebSocket.android"],
                                  :requires    ["WebSocketBase"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocket.ios.js",
                                  :provides    ["WebSocket.ios"],
                                  :requires    ["RCTDeviceEventEmitter" "NativeModules" "WebSocketBase"],
                                  :module-type :commonjs}
                                 {:file
                                               "Libraries/WebSocket/WebSocketBase.js",
                                  :provides    ["WebSocketBase"],
                                  :requires    [],
                                  :module-type :commonjs}]}}]})
