import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';
import { ServersComponent } from './servers/servers.component';

@NgModule({
  // register the component here (tell angular we need this component for our app) , 
  // but also need to import it (to tell typescript where to find it) 
  declarations: [
    AppComponent,
    ServerComponent, 
    ServersComponent
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  // tell angular which component should you be aware of at the point of time the 
  // whole application starts, which component should you rrecognize in the index html file
  bootstrap: [AppComponent], 
})
export class AppModule { }
