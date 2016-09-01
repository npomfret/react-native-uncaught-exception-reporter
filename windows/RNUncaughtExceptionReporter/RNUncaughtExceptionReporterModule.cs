
using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNUncaughtExceptionReporter
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNUncaughtExceptionReporterModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNUncaughtExceptionReporterModule"/>.
        /// </summary>
        internal RNUncaughtExceptionReporterModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNUncaughtExceptionReporter";
            }
        }
    }
}
