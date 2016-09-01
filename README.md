
# react-native-uncaught-exception-reporter

## Getting started

`$ npm install react-native-uncaught-exception-reporter --save`

### Mostly automatic installation

`$ react-native link react-native-uncaught-exception-reporter`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-uncaught-exception-reporter` and add `RNUncaughtExceptionReporter.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNUncaughtExceptionReporter.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNUncaughtExceptionReporterPackage;` to the imports at the top of the file
  - Add `new RNUncaughtExceptionReporterPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-uncaught-exception-reporter'
  	project(':react-native-uncaught-exception-reporter').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-uncaught-exception-reporter/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-uncaught-exception-reporter')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNUncaughtExceptionReporter.sln` in `node_modules/react-native-uncaught-exception-reporter/windows/RNUncaughtExceptionReporter.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Cl.Json.RNUncaughtExceptionReporter;` to the usings at the top of the file
  - Add `new RNUncaughtExceptionReporterPackage()` to the `List<IReactPackage>` returned by the `Packages` method
      

## Usage
```javascript
import RNUncaughtExceptionReporter from 'react-native-uncaught-exception-reporter';

// TODO: What do with the module?
RNUncaughtExceptionReporter;
```
  