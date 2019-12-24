import React from 'react';
import {
  Text,
  View,
  StyleSheet,
  TouchableNativeFeedback,
  NativeModules,
  DeviceEventEmitter,
} from 'react-native';

const FirebaseMessaging = NativeModules.FirebaseMessaging;

class HelloWorld extends React.Component {
  componentDidMount() {
    this.listener = DeviceEventEmitter.addListener('onReceived', event => {
      console.log(event);
    });
  }
  render() {
    return (
      <View style={{flex: 1}}>
        <View style={styles.toolbar}>
          <Text style={styles.title}>Hurray</Text>
        </View>
        <View style={{flex: 1, backgroundColor: '#FFFFFF'}}>
          <TouchableNativeFeedback onPress={() => alert('I am called')}>
            <Text>Click Me</Text>
          </TouchableNativeFeedback>
        </View>
      </View>
    );
  }
}

export default HelloWorld;

const styles = StyleSheet.create({
  toolbar: {
    height: 60,
    elevation: 3,
    backgroundColor: '#F86B17',
    justifyContent: 'center',
    padding: 15,
  },
  title: {
    color: '#FFFFFF',
    fontSize: 30,
  },
});
