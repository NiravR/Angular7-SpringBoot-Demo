import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }
  
  getUsers(){
    return this.http.get('https://reqres.in/api/users?delay=2');
  }

  getEmployees(){
    console.log('test employee call');
    return this.http.get<Employee[]>('http://localhost:8080/employees')
    //return this.http.get('https://reqres.in/api/users')
  }
}

export class Employee{
  constructor(
    public empId:string,
    public name:string,
    public designation:string,
    public salary:string,
  ) {}
}
