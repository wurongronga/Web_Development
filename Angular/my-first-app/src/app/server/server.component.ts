import {Component} from '@angular/core'


// decorator: tells angular this is not only a normal ts file, but instead a component
@Component({
    selector: 'app-server', // the HTML tag by which you're able to use this component later in your component templates -> a string
    templateUrl: './server.component.html', // the HTML file by which we will use for the server component
}

) 
export class ServerComponent {
    serverID = 10;
    serverStatus = 'offline';

    getServerStatus() {
        return this.serverStatus;
    }
}