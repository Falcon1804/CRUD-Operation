import { Component , OnInit} from '@angular/core';
import { Employee } from '../employee';
import { Router} from '@angular/router';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-images',
  templateUrl: './images.component.html',
  styleUrls: ['./images.component.css'],
  
})
export class ImagesComponent  implements OnInit {
  
  employee: Employee = new Employee();
  constructor(private employeeService: EmployeeService,
    private router: Router) { }

    
  ngOnInit(): void {
  }

 images=['../../assets/3.jpg'];
  goToEmployeeList(){
    this.router.navigate(['/employees']);
  }
 
}
