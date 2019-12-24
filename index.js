import {AppRegistry} from 'react-native';
import {Navigation} from 'react-native-navigation';
import App from './App';
import HelloWorld from './src/HelloWorld';

Navigation.registerComponent('App', () => App);
AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
Navigation.events().registerAppLaunchedListener(() => {
  Navigation.setRoot({
    root: {
      component: {
        name: 'App',
      },
    },
  });
});
