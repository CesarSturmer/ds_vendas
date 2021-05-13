
import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Home from '../src/pages/Home';
import DashBoard from '../src/pages/DashBoard';

const Routes = () => {
  return (
    <BrowserRouter>

      <Switch>
        <Route path="/" exact> <Home /> </Route>
        <Route path="/dashboard" exact> <DashBoard /> </Route>


      </Switch>



    </BrowserRouter>

  );
}

export default Routes;
