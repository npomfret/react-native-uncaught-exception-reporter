
using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNReactNativeUncaughtExceptionReporter
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeUncaughtExceptionReporterModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeUncaughtExceptionReporterModule"/>.
        /// </summary>
        internal RNReactNativeUncaughtExceptionReporterModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeUncaughtExceptionReporter";
            }
        }
    }
}
