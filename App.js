import React from 'react';
import {
  Text,
  View,
  StyleSheet,
  NativeModules,
  TouchableNativeFeedback,
} from 'react-native';

const TabView = NativeModules.TabView;

class App extends React.Component {
  goToView = () => {
    TabView.startTabActivity();
  };
  render() {
    return (
      <View style={{flex: 1}}>
        <TouchableNativeFeedback onPress={() => this.goToView()}>
          <Text>Click Me</Text>
        </TouchableNativeFeedback>
      </View>
    );
  }
}

export default App;
