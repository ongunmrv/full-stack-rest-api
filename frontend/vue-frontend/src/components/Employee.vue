<template>
    <div class="container">
        <h1 class="text-center">Employees List</h1>
        <table class="table table-striped">
            <thead>
                <th>Employee Id</th>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email</th>
            </thead>
            <tbody>
                <tr v-for="employee, i in employees" :key="employee.id">
                    <td>{{employee.id}}</td>
                    <td>{{employee.firstName}}</td>
                    <td>{{employee.lastName}}</td>
                    <td>{{employee.email}}</td>
                    <td><button type="button" class="btn btn-secondary">Update</button></td>
                    <td><button type="button" class="btn btn-secondary" v-on:click="deleteEmployee(employee.id, i)">Delete</button></td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import EmployeeService from '../services/EmployeeService'

export default {
    name: 'Employees',
    data() {
        return {
            employees: []
        }
    },
    methods: {
        getEmployees() {
            EmployeeService.getEmployees().then((response) => {
                this.employees = response.data;
            })
        },
        deleteEmployee(id, i) {
             EmployeeService.deleteEmployee(id).then(() => {
                this.employees.splice(i, 1);
            })
        }
    },
    created() {
        this.getEmployees();
    }

}
</script>
