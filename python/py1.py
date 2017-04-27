#!/usr/bin/env python3
# -*- coding: utf-8 -*-
def my_abs(x):
	if not isinstance(x, (int, float)):
		raise TypeError("input type error");
	if x>=0:
		return x
	else:
		return -x

