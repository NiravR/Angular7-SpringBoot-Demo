import { Component, OnInit } from '@angular/core';
import {DataService } from '../data.service';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent implements OnInit {
  constructor(private data: DataService){ }
  employees: String[];
  ngOnInit() {
    this.data.getEmployees().subscribe(
      response => this.handleSuccessfulResponse(response),
    )
  }

  handleSuccessfulResponse(response)
  {
      this.employees=response;
  }

}
