// Copyright (c) Microsoft Corporation.
// All rights reserved.
//
// This code is licensed under the MIT License.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files(the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions :
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
package com.microsoft.identity.common.unit;

import com.microsoft.identity.common.internal.authorities.AccountsInOneOrganization;
import com.microsoft.identity.common.internal.authorities.AllAccounts;
import com.microsoft.identity.common.internal.authorities.AzureActiveDirectoryAudience;
import com.microsoft.identity.common.internal.authorities.Environment;
import com.microsoft.identity.common.internal.providers.microsoft.azureactivedirectory.AzureActiveDirectory;
import com.microsoft.identity.common.internal.providers.microsoft.azureactivedirectory.AzureActiveDirectoryEnvironment;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AudienceDefaultPreProductionCloudUrlTest {

    @Before
    public void init(){
        AzureActiveDirectory.setEnvironment(Environment.PreProduction);
    }

    @After
    public void finalize(){
        AzureActiveDirectory.setEnvironment(Environment.Production);
    }

    @Test
    public void test_AccountsInOneOrganizationDefaultCloudUrl()  {

        AzureActiveDirectoryAudience audience = new AccountsInOneOrganization();
        Assert.assertEquals(AzureActiveDirectoryEnvironment.PREPRODUCTION_CLOUD_URL, audience.getCloudUrl());

    }

    @Test
    public void test_AllAccountsDefaultCloudUrl()  {

        AzureActiveDirectoryAudience audience = new AllAccounts();
        Assert.assertEquals(AzureActiveDirectoryEnvironment.PREPRODUCTION_CLOUD_URL, audience.getCloudUrl());

    }

    @Test
    public void test_AnyOrganizationAccountDefaultCloudUrl() {

        AzureActiveDirectoryAudience audience = new AllAccounts();
        Assert.assertEquals(AzureActiveDirectoryEnvironment.PREPRODUCTION_CLOUD_URL, audience.getCloudUrl());

    }

    @Test
    public void test_AnyPerosnalAccountDefaultCloudUrl()  {

        AzureActiveDirectoryAudience audience = new AllAccounts();
        Assert.assertEquals(AzureActiveDirectoryEnvironment.PREPRODUCTION_CLOUD_URL, audience.getCloudUrl());

    }





}
