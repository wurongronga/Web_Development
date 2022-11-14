# angular - udemy the complete guide Max
watch the essentials (frrom fundamentals of ts to building realtione, serverless applications with firebase, can jump through reactive forms, consuming HTTP serrvice, authentication and suthorization) and 


## get started

1. structure of angualr project
   - app: components and modules (every application has at least one component and one moduale) 
   - assets: static files - icons, images
   - environments: configrations
2. create a angular project using 
   1. install angualr cli with `npm install -g @angular/cli`
   2. create new angular project `ng new <project-name>`
   3. `cd <project-name>`
   4. `ng serve`
3. using bootstrap for styling
   1. install bootstrap locally (only for the project): npm install --save bootstrap@3 -> then we will have a bootstrap folder in the node_modules folder
   2. add the `node_modules/bootstrap/dist/css/bootstrap.min.css` into `angular.json` -> styles section
   3. once we've done, we add the moduel into our app


## the basics
1. Angular is the framework which allows you to create a single-page application, and the index.html is the file that served by server.
2. Modulle: a bundle of functionalities, for example, bundle component pieces of your app into packages

- how to create a component and register it into app
  - manually
    - create a component folder and named it with component name (e.g. create `server` folder for the server component)
    - navigate to `server` folder, and create `server.component.ts` file. this is basicly ts class that we are using for our component. so export it as `ServerComponent`  so that we can use it from outside
      - in the ts file, add the component derector to tell angular this is not only a normal ts file, but a component (add `@Component(){}`)

        ```typescript
        import {Component} from '@angular/core'

        // decorator: tells angular this is not only a normal ts file, but instead a component
        @Component({
           selector: 'app-server', // the HTML tag by which you're able to use this component later in your component templates -> a string
           templateUrl: './server.component.html', // the HTML file by which we will use for the server component
        }

        ) 
        export class ServerComponent {

        }
        ```
         > always have template / templateUrl in the component ts file
    - register
      - navigate to `app.module.ts`, add `ServerComponent` into declarations

        ```typescript
        import { NgModule } from '@angular/core';
        import { BrowserModule } from '@angular/platform-browser';

        import { AppComponent } from './app.component';
        import { ServerComponent } from './server/server.component';

        @NgModule({
        // register the component here (tell angular we need this component for our app) , 
        // but also need to import it (to tell typescript where to find it) 
        declarations: [
           AppComponent,
           ServerComponent, 
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
        ```
      
      - navigate to `app.component.html` and add the component tag into it 
        
        ```html
        <h1>I'm in the AppComponent</h1>
        <hr>
        <app-server></app-server>
        ```

    - CLI command
      - under the project directory, e.g. my-first-app, run `ng generate component <component name>` or `ng g c <component name>`

- Data Binding
  > data binding is a communication between the ts file and the html / templete file
  1. string interpolation
    - create property in ts file: serverID and serverStatus

      ```ts
      export class ServerComponent {
      serverID = 10;
      serverStatus = 'offline';

      getServerStatus() {
         return this.serverStatus;
         }
      }
      ```

    - add property to html, using string interpolation to refer it
  
      ```html
      <h2>the server component</h2>
      <p>The Server {{ serverID }} is {{ serverStatus }} </p>
      <p>The {{ 'Server' }} {{ serverID }} is {{ serverStatus }} </p>
      <p>The {{ 'Server' }} {{ serverID }} is {{ getServerStatus() }} </p>

      <!-- <p>The {{ <call some method here that returns string> }} {{ serverID }} is {{ serverStatus }} </p> -->
         <!-- we can use:
            1. string interpolation
            2. hard code string
            3. call a function that returns string
            4. ternary expression: condition ? doThisIfTrue : doThisIfFalse
            
            while we cannot use 
            1. block expression 
            2. multi-line expression 
            3. "if" or a "for" control structure  -->
      ```

   2. property binding
   3. events binding
   4. two way binding