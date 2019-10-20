#!/usr/bin/env python
# coding=utf-8
import unittest
from employee import Employee

class TestEmployee(unittest.TestCase):
    def setUp(self):
        self.my_employee1= Employee('Wan','Yong',150000)
        self.my_employee1.give_raise()
        self.my_employee2 = Employee('Wan','Bei',140000)
        self.my_employee2.give_raise(10000)

    def test_give_default_raise(self):
        self.assertEqual(self.my_employee1.first_name,'Wan')
        self.assertEqual(self.my_employee1.last_name,'Yong')
        self.assertEqual(self.my_employee1.annual_pay,155000)

    def test_give_custom_raise(self):
        self.assertEqual(self.my_employee2.first_name,'Wan')
        self.assertEqual(self.my_employee2.last_name,'Bei')
        self.assertEqual(self.my_employee2.annual_pay,150000)

unittest.main()
