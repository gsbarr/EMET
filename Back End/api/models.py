from django.db import models

# Create your models here.
class User(models.Model):
    name = models.CharField(max_length=150, null=False)
    last_name = models.CharField(max_length=150, null=False)
    email = models.EmailField(null=False, unique=True)
    password = models.CharField(max_length=250, null=False)