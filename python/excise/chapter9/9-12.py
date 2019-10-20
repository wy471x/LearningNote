#!/usr/bin/env python
# coding=utf-8
from user import User
from privileges_admin import Privileges,Admin

admin = Admin("wan","yong","play basketball")
admin.describe_user()
admin.privileges.show_privileges()
